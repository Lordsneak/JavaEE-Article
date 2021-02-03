<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Article Page</title>
</head>
<body>
<p></p>
<div class="container col-md-10 col-md-offset-1">
        <div class="card card-primary">
            <div class="card-heading">
             <h6>Recherche Article</h6>
            </div>
            <div class="card-body">
               <form action="cherche.do" method="get">
                <label>Mot Cl�</label>
                <input type="text" name="motCle"/>
                <button class="btn btn-primary" type="submit" >Cherche</button>
               </form>
               <table class="table">
               <tr>
               <th scope="col">ID</th scope="col"> <th scope="col">Nom</th>  <th scope="col">Text</th>
               </tr>
               <tr>
               <c:forEach items="${model.articles}" var="a"> 
               
               <td scope="row">${a.id}</td>
               <td scope="row">${a.nom}</td>
               <td scope="row">${a.text}td>
               
               </c:forEach>

               </tr>
               </table>
            </div>
</div>  
</div>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>


</body>
</html>