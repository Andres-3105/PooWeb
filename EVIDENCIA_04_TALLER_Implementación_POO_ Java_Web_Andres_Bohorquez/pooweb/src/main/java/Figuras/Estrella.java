package Figuras;
import java.util.*;

public class Estrella extends Figuras {
    private double lado;
    private double base;
    private double altura;

    Estrella(){
    }

    public Estrella(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    
    public Estrella(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    Scanner capturar = new Scanner(System.in);
    public void areaOvalo(){
        System.out.println("Area Estrella");
        System.out.println("Para calcular debemos partir la estrella en 5 triangulos:");
        System.out.println("Ingrese la base:");
        base = capturar.nextDouble();
        System.out.println("Ingrese la altura:");
        altura = capturar.nextDouble();
    }

    double area=0;
    double areaTriangulo=0;
    public double calcularArea(){
        areaTriangulo= base*altura/2;
        area = areaTriangulo*5;
        return area;
    }

    public void mostrarArea(){
        System.out.println("El area del hexagono es " + area + " cm²");
    }

    public void perimetroEstrella(){
        System.out.println("Perimetro Octagono");
        System.out.println("Ingrese el radio menor del Ovalo: ");
        lado = capturar.nextDouble();
    }

    double perimetro=0;
    public double calcularPerimetro(){
        perimetro = lado*5;
        return perimetro;
    }

    public void mostrarPerimetro(){
        System.out.println("El perimetro del hexagono es " + perimetro + " cm");
    }
}