<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Rectangulo</title>
    <link rel="stylesheet" href="estilos.css">
</head>
<body>
    <h1>Figuras Geométricas</h1>

  <div class="figure">
    <img src="Imagenes/Rectangulo.png" alt="Rectángulo">
    <p>Rectángulo</p>
  </div>

  <hr>
  <form action="figura" method="post">
    <h2>Rectángulo</h2>
    <h2>Area</h2>
    <label>Base:</label>
    <input type="text" name="base" required>

    <label>Altura:</label>
    <input type="text" name="altura" required>

    <button type="submit" name="control" value="arearec">Calcular</button>
  </form>
  <p style="justify-content: center; color: aliceblue; font-size: 1.25em;">
    <% if (request.getAttribute("area") !=null) { %>
      El Área de la figura es <%=request.getAttribute("area")%>
    <% } %>
  </p>
  <form action="figura" method="post">
    <h2>Perimetro</h2>
    <label>Lado 1:</label>
    <input type="text" name="lado1" required>

    <label>Lado 2:</label>
    <input type="text" name="lado2" required>

    <label>Lado 3:</label>
    <input type="text" name="lado3" required>

    <label>Lado 4:</label>
    <input type="text" name="lado4" required>

    <button type="submit" name="control" value="perimetrorec">Calcular</button>
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