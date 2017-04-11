
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Budget Details</title>
        <link rel="stylesheet" type="text/css" href="styles/index.css">
        <link rel="stylesheet" type="text/css" href="styles/budgetBanner.css">
        <link rel="stylesheet" type="text/css" href="styles/menuBar.css">
        <link rel="stylesheet" type="text/css" href="styles/form.css">
        <link rel="stylesheet" type="text/css" href="styles/links.css">
        <link rel="stylesheet" type="text/css" href="styles/table.css">
        <link rel="stylesheet" type="text/css" href="styles/categorySummaryPanel.css">
        <link rel="stylesheet" type="text/css" href="styles/dialogWindow.css">
        <link rel="stylesheet" type="text/css" href="styles/categoryTable.css">
        <link href="https://fonts.googleapis.com/css?family=Lato:400,700" rel="stylesheet">
        <script src="scripts/budgetBannerScript.js"></script>
        <script src="scripts/newBudgetDialogScript.js"></script>
        <script src="scripts/newItemDialogScript.js"></script>
        <script src="scripts/windowScript.js"></script>
        <script src="scripts/signoutScript.js"></script>
    </head>
    <body>
        <jsp:include page="/includes/budgetBanner.jsp"/>
        <jsp:include page="/includes/menuBar.jsp"/>
        <jsp:include page="/includes/dialogs/newBudgetDialog.jsp"/>
        <jsp:include page="/includes/dialogs/newHousingItemDialog.jsp"/>
        <div class="wrapper">
            <div class="columnContainer">
                <div class="leftColumn">
                    <jsp:include page="/includes/categorySummaryPanel.jsp"/>    
                </div>
                <div class="rightColumn">
                    <jsp:include page="/includes/categoryTable.jsp"/>     
                </div>
            </div>
        </div>        
    </body>
</html>