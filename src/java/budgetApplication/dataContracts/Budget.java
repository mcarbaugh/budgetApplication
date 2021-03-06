
package budgetApplication.dataContracts;

import budgetApplication.baseClasses.MonthEnum;
import java.io.Serializable;

public class Budget implements Serializable {
    private int id;
    private MonthEnum month;
    private int year;
    private Double totalSpent;
    private Double totalAmount;
    
    public Budget() {
        id = 0;
        month = MonthEnum.JANUARY;
        year = 1980;
        totalSpent = 0.0;
        totalAmount = 0.0;
    }
    
    public Budget(MonthEnum month, int year) {
        id = 0;
        this.month = month;
        this.year = year;
        totalSpent = 0.0;
        totalAmount = 0.0;
    }
    
    public int getId() {
        return id;
    }
    
    public MonthEnum getMonth() {
        return month;
    }
    
    public int getYear() {
        return year;
    }
    
    public Double getTotalSpent() {
        return totalSpent;
    }
    
    public Double getTotalAmount() {
        return totalAmount;
    }
    
    public Double getRemainingBalance() {
        return totalAmount - totalSpent;
    }
    
    public void setId(int value) {
        id = value;
    }
    
    public void setMonth(MonthEnum value) {
        month = value;
    }
    
    public void setYear(int value) {
        year = value;
    }
    
    public void setTotalSpent(Double value) {
        totalSpent = value;
    }
    
    public void setTotalAmount(Double value) {
        totalAmount = value;
    }
}
