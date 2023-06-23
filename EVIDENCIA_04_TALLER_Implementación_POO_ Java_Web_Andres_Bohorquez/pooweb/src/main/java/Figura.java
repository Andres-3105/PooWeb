import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Figuras.Estrella;
import Figuras.Hexagono;
import Figuras.Octagono;
import Figuras.Ovalo;
import Figuras.Rectangulo;
import Figuras.Triangulo;

public class Figura extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entro al servlet");
        String control = req.getParameter(("control"));
        System.out.println(control);
        switch (control) {
            case "Rectangulo":
                    req.getRequestDispatcher("Rectangulo.jsp").forward(req,resp);
                break;
            case "Triangulo":
                    req.getRequestDispatcher("Triangulo.jsp").forward(req,resp);
                break;
            case "Hexagono":
                    req.getRequestDispatcher("Hexagono.jsp").forward(req,resp);
                break;
            case "Octagono":
                    req.getRequestDispatcher("Octagono.jsp").forward(req,resp);
                break;
            case "Ovalo":
                    req.getRequestDispatcher("Ovalo.jsp").forward(req,resp);
                break;
            case "Estrella":
                    req.getRequestDispatcher("Estrella.jsp").forward(req,resp);
                break;
            default:
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entro al do post");
        String control = req.getParameter(("control"));
        System.out.println("El control es " + control);
        switch (control) {
            case "arearec":
                double base=Double.parseDouble(req.getParameter("base"));
                double altura=Double.parseDouble(req.getParameter("altura"));
                Rectangulo rectangulo = new Rectangulo(base, altura);
                req.setAttribute("area", rectangulo.calcularArea());
                System.out.println("El area del rectangulo es "+rectangulo.calcularArea());
                req.getRequestDispatcher("Rectangulo.jsp").forward(req, resp);
                break;
            case "areatri":
                double base2=Double.parseDouble(req.getParameter("base2"));
                double altura2=Double.parseDouble(req.getParameter("altura2"));
                Triangulo triangulo = new Triangulo(base2, altura2);
                req.setAttribute("area", triangulo.calcularArea());
                System.out.println("El area del triangulo es "+triangulo.calcularArea());
                req.getRequestDispatcher("Triangulo.jsp").forward(req, resp);
                break;
            case "areahexa":
                double perimetro=Double.parseDouble(req.getParameter("perimetro"));
                double apotema=Double.parseDouble(req.getParameter("apotema"));
                Hexagono hexagono = new Hexagono(apotema, perimetro);
                req.setAttribute("area", hexagono.calcularArea());
                System.out.println("El area del hexagono es "+hexagono.calcularArea());
                req.getRequestDispatcher("Hexagono.jsp").forward(req, resp);
                break;
            case "areaocta":
                double perimetro2=Double.parseDouble(req.getParameter("perimetro"));
                double apotema2=Double.parseDouble(req.getParameter("apotema"));
                Octagono octagono = new Octagono(apotema2, perimetro2);
                req.setAttribute("area", octagono.calcularArea());
                System.out.println("El area del octagono es "+octagono.calcularArea());
                req.getRequestDispatcher("Octagono.jsp").forward(req, resp);
                break;
            case "areaova":
                double radioMayor=Double.parseDouble(req.getParameter("radioMayor"));
                double radioMenor=Double.parseDouble(req.getParameter("radioMenor"));
                Ovalo ovalo = new Ovalo(radioMayor, radioMenor);
                req.setAttribute("area", ovalo.calcularArea());
                System.out.println("El area del ovalo es "+ovalo.calcularArea());
                req.getRequestDispatcher("Ovalo.jsp").forward(req, resp);
                break;
            case "areaestre":
                double base3=Double.parseDouble(req.getParameter("base"));
                double altura3=Double.parseDouble(req.getParameter("altura"));
                Estrella estrella = new Estrella(base3, altura3);
                req.setAttribute("area", estrella.calcularArea());
                System.out.println("El area de la estrella es "+estrella.calcularArea());
                req.getRequestDispatcher("Estrella.jsp").forward(req, resp);
                break;
            case "perimetrorec":
                double lado1=Double.parseDouble(req.getParameter("lado1"));
                double lado2=Double.parseDouble(req.getParameter("lado2"));
                double lado3=Double.parseDouble(req.getParameter("lado3"));
                double lado4=Double.parseDouble(req.getParameter("lado4"));
                Rectangulo rectangulo1 = new Rectangulo(lado1, lado2, lado3, lado4);
                req.setAttribute("perimetro", rectangulo1.calcularPerimetro());
                System.out.println("El perimetro del rectangulo es "+rectangulo1.calcularPerimetro());
                req.getRequestDispatcher("Rectangulo.jsp").forward(req, resp);
                break;
            case "perimetrotri":
                double lad1=Double.parseDouble(req.getParameter("lado1"));
                double lad2=Double.parseDouble(req.getParameter("lado2"));
                double lad3=Double.parseDouble(req.getParameter("lado3"));
                Triangulo triangulo1 = new Triangulo(lad1, lad2, lad3);
                req.setAttribute("perimetro", triangulo1.calcularPerimetro());
                System.out.println("El perimetro del triangulo es "+triangulo1.calcularPerimetro());
                req.getRequestDispatcher("Triangulo.jsp").forward(req, resp);
                break;
            case "perimetrohexa":
                double lado=Double.parseDouble(req.getParameter("lado"));
                Hexagono hexagono1 = new Hexagono(lado);
                req.setAttribute("perimetro", hexagono1.calcularPerimetro());
                System.out.println("El perimetro del hexagono es "+hexagono1.calcularPerimetro());
                req.getRequestDispatcher("Hexagono.jsp").forward(req, resp);
                break;
            case "perimetroocta":
                double ladod1=Double.parseDouble(req.getParameter("lado"));
                Octagono octagono1 = new Octagono(ladod1);
                req.setAttribute("perimetro", octagono1.calcularPerimetro());
                System.out.println("El perimetro del octagono es "+octagono1.calcularPerimetro());
                req.getRequestDispatcher("Octagono.jsp").forward(req, resp);
                break;
            case "perimetroova":
                double radioMayor1=Double.parseDouble(req.getParameter("radioMayor"));
                double radioMenor1=Double.parseDouble(req.getParameter("radioMenor"));
                Ovalo ovalo1 = new Ovalo(radioMayor1, radioMenor1);
                req.setAttribute("perimetro", ovalo1.calcularPerimetro());
                System.out.println("El perimetro del ovalo es "+ovalo1.calcularPerimetro());
                req.getRequestDispatcher("Ovalo.jsp").forward(req, resp);
                break;
            case "perimetroestre":
                double ladou1=Double.parseDouble(req.getParameter("longitudLado"));
                Estrella estrella1 = new Estrella(ladou1);
                req.setAttribute("perimetro", estrella1.calcularPerimetro());
                System.out.println("El perimetro de la estrella es "+estrella1.calcularPerimetro());
                req.getRequestDispatcher("Estrella.jsp").forward(req, resp);
                break;
            default:
                break;
        }
    }
}