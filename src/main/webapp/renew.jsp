<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="Inscription">
        <meta name="author" content="Okeanos">

        <link href="resources/css/bootstrap.min.css" rel="stylesheet" type="text/css">
        <link href="resources/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css">
        <link href="resources/css/normalize.css" rel="stylesheet" type="text/css">
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
                width: 600px;
                margin-left: -300px; /* Cette valeur doit être la moitié négative de la valeur du width */
            }

            error {
                color: red;
            }

            message-block {
                padding-top: 5px;
            }

        </style>
    </head>
    <body>

        <div class="centre">

            <h1>Inscription</h1>

            <form:form modelAttribute="model" action="renew" method="POST">
                <spring:bind path="licenseNumber">
                    <div class="form-group <%= status.isError() ? "has-error" : ""%>">
                        <label for="licence">Numéro de licence FFESSM</label>
                        <form:input type="text" class="form-control" id="licence" path="licenseNumber" placeholder="Numéro de licence" />
                        <form:errors path="licenseNumber" cssClass="error"/>
                    </div>
                </spring:bind>
                <spring:bind path="address">
                    <div class="form-group <%= status.isError() ? "has-error" : ""%>">
                        <label for="adresse">Adresse</label>
                        <form:input type="text" class="form-control" id="adresse" path="address" placeholder="Adresse" />
                        <form:errors path="address" cssClass="error"/>
                    </div>
                </spring:bind>
                <spring:bind path="postalCode">
                    <div class="form-group <%= status.isError() ? "has-error" : ""%>">
                        <label for="cp">Code postal</label>
                        <form:input type="text" class="form-control" id="cp" path="postalCode" placeholder="Code postal" />
                        <form:errors path="postalCode" cssClass="error"/>
                    </div>
                </spring:bind>
                <spring:bind path="city">
                    <div class="form-group <%= status.isError() ? "has-error" : ""%>">
                        <label for="ville">Ville</label>
                        <form:input type="text" class="form-control" id="ville" path="city" placeholder="Ville" />
                        <form:errors path="city" cssClass="error"/>
                    </div>
                </spring:bind>
                <spring:bind path="mail">
                    <div class="form-group <%= status.isError() ? "has-error" : ""%>">
                        <label for="email">Adresse mail</label>
                        <form:input type="email" class="form-control" id="email" path="mail" placeholder="Adresse mail" />
                        <form:errors path="mail" cssClass="error"/>
                    </div>
                </spring:bind>
                <spring:bind path="phone">
                    <div class="form-group <%= status.isError() ? "has-error" : ""%>">
                        <label for="tel">Téléphone</label>
                        <form:input type="tel" class="form-control" id="tel" path="phone" placeholder="Téléphone" />
                        <form:errors path="phone" cssClass="error"/>
                    </div>
                </spring:bind>

                <button type="submit" class="btn btn-default">S'inscrir</button>
                <button type="button" class="btn btn-info" onclick="window.location='/'">Annuler</button>
            </form:form>

            <div class="message-block">

                <c:if test="${success != null && success}">
                    <div class="alert alert-success alert-dismissable" style="text-align: left;">
                        <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                        Votre inscription vient d'étre prise en compte
                    </div>

                </c:if>

                <c:if test="${success != null && !success}">
                    <div class="alert alert-danger alert-dismissable" style="text-align: left;">
                        <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                        <c:out value="${error_message}"/>
                    </div>

                </c:if>
            </div>

        </div>

    </body>
</html>

<script type="text/javascript" charset="utf-8">

    $(function () {
        $("#licence").focus();
    });
</script>