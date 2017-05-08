<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/style.css">        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Livre d'or</title>
    </head>
    <body>
        <h3>Confirmer la suppression ?</h3>
    </body>
    <%  
        String[] liste= (String[])session.getAttribute("liste_suppr");
        for(int i=0; i<liste.length;i++)
            out.print("id:"+liste[i] +" ");
    %>    
    <p> <a href="SupprimerServlet">oui</a></p>
    <p> <a href="supprimer">non</a></p>
    <p><a href="Accueil">Retour</a></p>
</html>
