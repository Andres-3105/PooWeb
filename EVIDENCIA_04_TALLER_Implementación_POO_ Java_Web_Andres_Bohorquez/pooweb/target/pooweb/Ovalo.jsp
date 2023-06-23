<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%><!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ovalo</title>
    <link rel="stylesheet" href="estilos.css">
</head>
<body>
    <h1>Figuras Geométricas</h1>

    <div class="figure">
      <img src="Imagenes/Ovalo.png" alt="Óvalo">
      <p>Óvalo</p>
    </div>
  
    <hr>
  
    <form action="figura" method="post">
      <h2>Óvalo</h2>
      <h2>Area</h2>
      <label>Radio mayor:</label>
      <input type="text" name="radioMayor" required>
  
      <label>Radio menor:</label>
      <input type="text" name="radioMenor" required>
  
      <button type="submit" name="control" value="areaova">Calcular</button>
    </form>
    <p style="justify-content: center; color: aliceblue; font-size: 1.25em;">
      <% if (request.getAttribute("area") !=null) { %>
        El Área de la figura es <%=request.getAttribute("area")%>
      <% } %>
    </p>
    <form action="figura" method="post">
      <h2>Perimetro</h2>
      <label>Radio mayor:</label>
      <input type="text" name="radioMayor" required>
  
      <label>Radio menor:</label>
      <input type="text" name="radioMenor" required>
  
      <button type="submit" name="control" value="perimetroova">Calcular</button>
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