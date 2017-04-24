
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<div class="categoryTableContainer">
    <div id="TransactionsButtonContainer">
        <c:url value="/TransactionHistory" var="transactionURL"/>
        <form method="GET" Action="${transactionURL}">
            <input type="text" value="${user.getId()}" name="userId" class="HiddenField"/>
            <input type="submit" value="Show Transaction History" id="TransactionsButton"/>
        </form>
    </div>
    
    <div id=" Food"/>
    <jsp:include page="/includes/categories/foodSection.jsp"/>
    
    <div id=" Transportation"/>
    <jsp:include page="/includes/categories/transportationSection.jsp"/>
    
    <div id=" Lifestyle"/>
    <jsp:include page="/includes/categories/lifestyleSection.jsp"/>
    
    <div id=" Housing"/>
    <jsp:include page="/includes/categories/housingSection.jsp"/>
    
    <div id=" Insurance"/>
    <jsp:include page="/includes/categories/insuranceSection.jsp"/>
    
    <div id=" Giving"/>
    <jsp:include page="/includes/categories/givingSection.jsp"/>
</div>