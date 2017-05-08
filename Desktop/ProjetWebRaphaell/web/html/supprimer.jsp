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
        <h3>Supprimer les messages</h3>
        <form method="get" action="Confirmer">
        <%
        ArrayList<MessageDor> list=bd.lireMessage();
        out.print("<table><th>Id</th><th>Pseudo</th><th>Message</th>");
        for(int i=0; i<list.size();i++){
            out.print("<tr><td><label><input type=checkbox name=cb_suppr value="+list.get(i).getId()+">"+list.get(i).getId()+"</label></td>");
            out.print("<td>"+list.get(i).getPseudo()+"</td>");
            out.print("<td>"+list.get(i).getMessage()+"</td></tr>");
        }
        out.print("</table>");
        %>
        <input type="submit" name="Supprimer" value="Supprimer">
    </form>
        <div id="p2"><a href="Accueil">Retour</a></div>
    </body>
</html>

