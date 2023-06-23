package Figuras;
import java.util.*;

public class Ovalo extends Figuras {
    private double radioMayor;
    private double radioMenor;

    Ovalo(){
    }

    public Ovalo(double radioMayor, double radioMenor) {
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
    }

    public double getRadioMayor() {
        return radioMayor;
    }

    public void setRadioMayor(double radioMayor) {
        this.radioMayor = radioMayor;
    }

    public double getRadioMenor() {
        return radioMenor;
    }

    public void setRadioMenor(double radioMenor) {
        this.radioMenor = radioMenor;
    }

    Scanner capturar = new Scanner(System.in);
    public void areaOvalo(){
        System.out.println("Area Ovalo");
        System.out.println("Ingrese el perimetro del Ovalo:");
        perimetro = capturar.nextDouble();
        System.out.println("Ingrese el radio menor del Ovalo: ");
        radioMenor = capturar.nextDouble();
        System.out.println("Ingrese el radio menor del Ovalo: ");
        radioMayor = capturar.nextDouble();
    }

    double area=0;
    public double calcularArea(){
        area = Math.PI*radioMenor*radioMayor;
        return area;
    }

    public void mostrarArea(){
        System.out.println("El area del hexagono es " + area + " cm²");
    }

    public void perimetroOvalo(){
        System.out.println("Perimetro Octagono");
        System.out.println("Ingrese el radio menor del Ovalo: ");
        radioMenor = capturar.nextDouble();
        System.out.println("Ingrese el radio menor del Ovalo: ");
        radioMayor = capturar.nextDouble();
    }

    double perimetro=0;
    public double calcularPerimetro(){
        perimetro = Math.PI*(radioMenor+radioMayor);
        return perimetro;
    }

    public void mostrarPerimetro(){
        System.out.println("El perimetro del hexagono es " + perimetro + " cm");
    }
}