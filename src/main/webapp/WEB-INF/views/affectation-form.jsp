<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Affectation</title>
</head>
<body>
<h1>Affecter un Employé</h1>
<form action="/affectation" method="post">
    <label for="employe">Employé:</label>
    <select name="employe.id" id="employe">
        <c:forEach var="employe" items="${employes}">
            <option value="${employe.id}">${employe.name}</option>
        </c:forEach>
    </select>
    <br/>
    <label for="projet">Projet:</label>
    <select name="projet.id" id="projet">
        <c:forEach var="projet" items="${projets}">
            <option value="${projet.id}">${projet.name}</option>
        </c:forEach>
    </select>
    <br/>
    <label for="implication">Implication:</label>
    <input type="number" id="implication" name="implication"/>
    <br/>
    <button type="submit">Affecter</button>
</form>
</body>
</html>
