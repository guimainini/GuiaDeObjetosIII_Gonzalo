package Ejercicio3;

public class Circulo extends Formas{
    private double radio;

    public Circulo(double radio, boolean color) {
        super(color);
        this.radio = radio;
    }


    public Circulo() {
        super();
    }




    //pi * radio ^2
    @Override
    public double area() {
        double area = Math.PI * Math.pow(radio,2);
        return area;
    }

    //2 * pi * radio
    @Override
    public double perimetro() {
        double perimetro = 2 * Math.PI * radio;
        return perimetro;
    }
}
