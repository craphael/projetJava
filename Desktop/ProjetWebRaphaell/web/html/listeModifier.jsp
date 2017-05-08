<%@page import="java.util.ArrayList"%>
<%@page import="bd.bd"%>
<%@page import="metier.MessageDor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Liste pour Modification</title>
    </head>
    <body>
        <h1>Modification des messages</h1>
        <%!
            String check(String[] liste, int id) {

                if (liste != null) {
                    for (int i = 0; i < liste.length; i++) {
                        int val = Integer.parseInt(liste[i]);
                        if (val == id) {
                            return "checked";
                        }
                    }
                }
                return "";
            }
        %>

        <%
            ArrayList<MessageDor> liste = bd.lireMessage();
            String[] listeId = (String[]) session.getAttribute("listeId");

            // faire la méthode check(id, listeSuppr) qui permet de check es cases si l'id est dans le tableau en session
            out.println("<form method='get' action='modification'>");
            out.println("<table>");
            out.println("<tr><td>Pseudo</td><td>Message</td><td></td></tr>");
            for (MessageDor m : liste) {
                out.println("<tr><td>" + m.getPseudo() + "</td><td>" + m.getMessage() + "</td><td><input type='checkbox' name='id' value=" + m.getId() + "></td></tr>");
            }
            out.println("</table>");
            out.println("<input type='submit' value='Modifier le message slectionner'>");
            out.println("</form>");

            String msg = (String) request.getAttribute("message_erreur");
            if (msg != null) {
                out.println(msg + "<br>");
            }

        %>
        <a href="Accueil">Retour</a>
    </body>
</html>
