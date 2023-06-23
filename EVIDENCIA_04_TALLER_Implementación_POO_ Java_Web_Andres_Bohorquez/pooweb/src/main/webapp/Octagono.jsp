<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Octágono</title>
    <link rel="stylesheet" href="estilos.css">
</head>
<body>
    <h1>Figuras Geométricas</h1>

    <div class="figure">
      <img src="Imagenes/Octagono.png" alt="Octágono">
      <p>Octágono</p>
    </div>
  
    <hr>
  
    <form action="figura" method="post">
      <h2>Octágono</h2>
      <h2>Area</h2>
      <label>Perimetro:</label>
      <input type="text" name="perimetro" required>

      <label>Apotema:</label>
      <input type="text" name="apotema" required>

      <button type="submit" name="control" value="areaocta">Calcular</button>
    </form>
    <p style="justify-content: center; color: aliceblue; font-size: 1.25em;">
      <% if (request.getAttribute("area") !=null) { %>
        El Área de la figura es <%=request.getAttribute("area")%>
      <% } %>
    </p>
    <form action="figura" method="post">
      <h2>Perimetro</h2>
      <label>Lado:</label>
      <input type="text" name="lado" required>
      <button type="submit" name="control" value="perimetroocta">Calcular</button>
    </form>
    <p style="justify-content: center; color: aliceblue; font-size: 1.25em;">
      <% if (request.getAttribute("perimetro") !=null) { %>
        El Perimetro de la figura es <%=request.getAttribute("perimetro")%>
      <% } %>
    </p>
    <br>
    <a href="index.jsp" class="button">Salir</a>
</body>
</html>