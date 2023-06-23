<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Estrella</title>
    <link rel="stylesheet" href="estilos.css">
</head>
<body>
    <h1>Figuras Geométricas</h1>

    <div class="figure">
      <img src="Imagenes/Estrella.png" alt="Estrella">
      <p>Estrella</p>
    </div>
  
    <hr>
  
    <form action="figura" method="post">
      <h2>Estrella</h2>
      <h2>Area</h2>
      <p style="justify-content: center; color: aliceblue;">Para calcular debemos partir la estrella en 5 triangulos</p>
      <label>Base:</label>
      <input type="text" name="base" required>
      <label>Altura:</label>
      <input type="text" name="altura" required>
  
      <button type="submit" name="control" value="areaestre">Calcular</button>
    </form>
    <p style="justify-content: center; color: aliceblue; font-size: 1.25em;">
      <% if (request.getAttribute("area") !=null) { %>
        El Área de la figura es <%=request.getAttribute("area")%>
      <% } %>
    </p>
    <form action="figura" method="post">
    <h2>Perimetro</h2>
    <label>Longitud del Lado:</label>
    <input type="text" name="longitudLado" required>

    <button type="submit" name="control" value="perimetroestre">Calcular</button>
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