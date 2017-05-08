<%-- 
    Document   : modifierMessage
    Created on : 24 mars 2017, 11:12:12
    Author     : clementraphaell
--%>

<%@page import="metier.MessageDor"%>
<%@page import="bd.bd"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/style.css">   
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Modifier</h1>
        <% 
            String id = (String) request.getAttribute("id");
            MessageDor msg = bd.getMessageDor(id);
            
            String pseudo = "";
            String message = "";
            if (msg != null) {
                pseudo = msg.getPseudo();
                message = msg.getMessage();
            }
        %>
        
        <form method="get" action="ModifierBD">
            <form class="form-inline">
            <div class="form-group">
              <label class="sr-only" for="exampleInputEmail3">Pseudo</label>
              <input type="text" class="form-control" name="pseudo" placeholder="Pseudo" value="<%= pseudo %>">
            </div>
            <div class="form-group">
              <label class="sr-only" for="exampleInputPassword3">Message</label>
              <input type="text" class="form-control" name="message" placeholder="Message" value="<%= message %>">
            </div>
            <div class="form-group">
              <input type="hidden" class="form-control" name="IdMessage" placeholder="IdMessage" value="<%= id %>">
            </div>
            <button type="submit" name="Modifier" class="btn btn-default" >Modifier</button>
            <div id="p2"><a href="Accueil">Retour</a></div>
            </form>
        </form>
    </body>
</html>
