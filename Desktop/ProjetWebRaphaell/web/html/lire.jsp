<%@page import="bd.bd"%>
<%@page import="java.util.ArrayList"%>
<%@page import="metier.MessageDor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css" > 
        <title>Livre d'or</title>
    </head>
    <body>
        <h3>Afficher les messages</h3>
        <%
        ArrayList<MessageDor> list=bd.lireMessage();
        out.print("<table><th>Pseudo</th><th>Message</th>");
        for(int i=0; i<list.size();i++){
            out.print("<tr><td>"+list.get(i).getPseudo()+"</td>");
            out.print("<td>"+list.get(i).getMessage()+"</td></tr>");
        }
        out.print("</table>");
        %>
        <div id="p2"><a href="Accueil">Retour</a></div>
    </body>
</html>
