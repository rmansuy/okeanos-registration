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
                width: 600px;
                margin-left: -300px; /* Cette valeur doit être la moitié négative de la valeur du width */
            }

            error {
                color: red;
            }

        </style>
    </head>
    <body>

        <div class="centre">
            <h1>Inscription Okeanos</h1>
            
            <button type="button" class="btn btn-primary btn-lg btn-block" onclick="window.location='main'">Je n'ai pas de licence FFESSM</button>
            <button type="button" class="btn btn-primary btn-lg btn-block">J'ai déjà une licence FFESSM</button>
            <button type="button" class="btn btn-primary btn-lg btn-block" onclick="window.location='view'">Voir les membres</button>
            
        </div>
    </body>
</html>

