package Figuras;
import java.util.*;
public class Rectangulo extends Figuras{
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;
    private double lado4;

    public Rectangulo(){
    }

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(double lado1, double lado2, double lado3, double lado4) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
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

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public double getLado4() {
        return lado4;
    }

    public void setLado4(double lado4) {
        this.lado4 = lado4;
    }

    Scanner capturar = new Scanner(System.in);
    public void areaRectangulo(){
        System.out.println("Area Rectangulo");
        System.out.println("Ingrese la base: ");
        base = capturar.nextDouble();
        System.out.println("Ingrese la altura: ");
        altura = capturar.nextDouble();
    }

    double area;
    public double calcularArea(){
    area = base*altura;
    return area;
    }

    public void mostrarArea(){
        System.out.println("El area del rectangulo es " + area + " cm²");
    }

    public void perimetroRectangulo(){
        System.out.println("Perimetro Rectangulo");
        System.out.println("Ingrese el lado 1: ");
        lado1 = capturar.nextDouble();
        System.out.println("Ingrese el lado 2: ");
        lado2 = capturar.nextDouble();
        System.out.println("Ingrese el lado 3: ");
        lado3 = capturar.nextDouble();
        System.out.println("Ingrese el lado 4: ");
        lado4 = capturar.nextDouble();
    }

    double perimetro=0;
    public double calcularPerimetro(){
        perimetro= lado1+lado2+lado3+lado4;
        return perimetro;
    }

    public void mostrarPerimetro(){
        System.out.println("El perimetro del rectangulo es " + perimetro + " cm");
    }
}