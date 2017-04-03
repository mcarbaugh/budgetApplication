
package budgetApplication.controllers;

import static budgetApplication.baseClasses.ConstantFields.*;
import budgetApplication.businessLogic.BudgetManager;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import budgetApplication.businessLogic.LoginFormManager;
import budgetApplication.dataContracts.*;
import java.util.List;
import javax.servlet.http.HttpSession;

@WebServlet(name = "loginFormController", urlPatterns = {"/loginForm"})
public class LoginFormController extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            int userId;
            int budgetId;            
            Double amount;
            Double spent;
            User user;
            List<Budget> budgets;
            String username = request.getParameter(USERNAME_FIELD);
            String password = request.getParameter(PASSWORD_FIELD);
            HttpSession currentSession;
            
            try (LoginFormManager manager = new LoginFormManager()) {
                user = manager.getUserByUsernameAndPassword(username, password);
                userId = user.getId();
            }
            
            if(userId != 0) {
                currentSession = request.getSession();
                currentSession.setAttribute(USER_ID_FIELD, user.getId());
            }
            
            try (BudgetManager budgetManager = new BudgetManager()) {
                budgets = budgetManager.getAllBudgetsByUserId(userId);
                
                // get totals for each budget
                for (Budget budget : budgets) {
                    budgetId = budget.getId();
                    amount = budgetManager.getTotalAmountById(budgetId);
                    spent = budgetManager.getTotalSpentById(budgetId);
                    budget.setTotalSpent(spent);
                    budget.setTotalAmount(amount);
                }
            }
            
            if(userId != 0) {
                request.setAttribute(USER_FIELD, user);
                request.setAttribute(BUDGETS_FIELD, budgets);
                request.getRequestDispatcher("pages/accountSummary.jsp").forward(request, response);
            }
            else {
                request.setAttribute(MESSAGE_FIELD, LOGIN_ERROR_MESSAGE);
                request.getRequestDispatcher("index.jsp").include(request, response);
            }
        }
        catch(Exception ex) {
            throw new ServletException(ex);
        }
    }
}
