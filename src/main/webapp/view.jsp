<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="Send All 2.0">
        <meta name="author" content="Kayentis R&D">

        <link href="resources/css/bootstrap.min.css" rel="stylesheet" type="text/css">
        <link href="resources/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css">
        <link href="resources/css/normalize.css" rel="stylesheet" type="text/css">
        <link href="resources/css/kayentis.css" rel="stylesheet" type="text/css">
        <link href="resources/css/ui-lightness/jquery-ui-1.10.4.custom.min.css" rel="stylesheet" type="text/css">
        <link href="resources/css/bootstrap-responsive.css" rel="stylesheet" type="text/css">

        <script type="text/javascript" src="resources/js/jquery-1.10.2.js"></script>
        <script type="text/javascript" src="resources/js/jquery-ui-1.10.4.custom.min.js"></script>
        <script type="text/javascript" src="resources/js/jquery.cookies.2.2.0.js"></script>
        <script type="text/javascript" src="resources/js/bootstrap.min.js"></script>


        <style>

            div.centre {
                position:absolute;
                left: 50%;
                width: 900px;
                margin-left: -450px; /* Cette valeur doit être la moitié négative de la valeur du width */
            }

            error {
                color: red;
            }

        </style>
    </head>
    <body>

        <div class="centre">

            <h1>Liste</h1>

            <table class="table table-hover" style="width: 100%;">
                <tr>
                    <th>Nom</th>
                    <th>Prénom</th>
                    <th>Adress</th>
                    <th>Code postal</th>
                    <th>Ville</th>
                    <th>Date de naissance</th>
                    <th>eMail</th>
                    <th>Téléphone</th>

                </tr>

                <c:forEach items="${model}" var="e">
                    <td><c:out value="${e.firstName }" /></td>
                    <td><c:out value="${e.lastName }" /></td>
                    <td><c:out value="${e.address }" /></td>
                    <td><c:out value="${e.postalCode }" /></td>
                    <td><c:out value="${e.city }" /></td>
                    <td><c:out value="${e.birthDate }" /></td>
                    <td><c:out value="${e.mail }" /></td>
                    <td><c:out value="${e.phone }" /></td>
                </c:forEach>
            </table>

        </div>           

    </body>
</html>
