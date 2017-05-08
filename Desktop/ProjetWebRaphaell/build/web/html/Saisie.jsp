<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/style.css">    
        <title>Saisir un message</title>
    </head>
    <body>
        <h3>Saisir un message</h3>
        
        <form method="get" action="Enregistrer">
            <form class="form-inline">
            <div class="form-group">
              <label class="sr-only" for="exampleInputEmail3">Pseudo</label>
              <input type="text" class="form-control" name="pseudo" placeholder="Pseudo">
            </div>
            <div class="form-group">
              <label class="sr-only" for="exampleInputPassword3">Message</label>
              <input type="text" class="form-control" name="message" placeholder="Message">
            </div>
            <button type="submit" name="Enregistrer" class="btn btn-default" >Enregistrer</button>
        </form>
        
        <p1><a href="Accueil">Retour</a></p1>
        
        
        <%
            String msg=(String)request.getAttribute("msg_erreur");
            if(msg != null)
                    out.println("<p>"+msg+"</p>");
            String msgInfo=(String)request.getAttribute("msg_info");
            if(msgInfo != null)
                    out.println("<p>"+msgInfo+"</p>");
        %>
    </body>
</html>
