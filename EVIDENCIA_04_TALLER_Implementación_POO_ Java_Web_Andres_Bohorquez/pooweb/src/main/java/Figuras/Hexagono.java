package Figuras;

import java.util.*;
public class Hexagono extends Figuras{
    private double apotema;
    private double lado;
    private double perimetro;

    public Hexagono() {
    }

    public Hexagono(double apotema, double perimetro) {
        this.apotema = apotema;
        this.perimetro = perimetro;
    }

    public Hexagono(double lado){
        this.lado = lado;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    Scanner capturar = new Scanner(System.in);
    public void areaHexagono(){
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

    public void perimetroHexagono(){
        System.out.println("Perimetro hexagono");
        System.out.println("Ingrese un lado del hexagono: ");
        lado = capturar.nextDouble();
    }

    public double calcularPerimetro(){
        perimetro = lado * 6;
        return perimetro;
    }

    public void mostrarPerimetro(){
        System.out.println("El perimetro del hexagono es " + perimetro + " cm");
    }
}