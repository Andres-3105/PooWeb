package Figuras;
import java.util.*;

public class Octagono extends Figuras {
    private double lado;
    private double apotema;
    private double perimetro;

    Octagono(){
    }

    public Octagono(double apotema, double perimetro) {
        this.apotema = apotema;
        this.perimetro = perimetro;
    }

    public Octagono(double lado) {
        this.lado = lado;
    }

    Scanner capturar = new Scanner(System.in);
    public void areaOvalo(){
        System.out.println("Area hexagono");
        System.out.println("Ingrese el perimetro del hexagono:");
        perimetro = capturar.nextDouble();
        System.out.println("Ingrese el apotema del hexagono: ");
        apotema = capturar.nextDouble();
    }

    double area=0;
    public double calcularArea(){
        area = perimetro*apotema/2;
        return area;
    }

    public void mostrarArea(){
        System.out.println("El area del hexagono es " + area + " cm²");
    }

    public void perimetroOctagono(){
        System.out.println("Perimetro Octagono");
        System.out.println("Ingrese un lado del hexagono: ");
        lado = capturar.nextDouble();
    }

    public double calcularPerimetro(){
        perimetro = lado * 8;
        return perimetro;
    }

    public void mostrarPerimetro(){
        System.out.println("El perimetro del hexagono es " + perimetro + " cm");
    }
}