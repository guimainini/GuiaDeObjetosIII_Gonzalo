package Ejercicio1;

public class Cilindro extends Circulo{
    private double altura = 1;

    //contrusctores
    public Cilindro(double radio, String color, double altura) {
        super(radio, color);
        this.altura = altura;
    }

    public Cilindro() {
        super();
    }


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    @Override
    public String toString() {
        return super.toString()+" altura = "+altura;
    }



    //V = Pi*(radio)^2 * altura
    public double calcularVolumen(){
        double volumen = Math.PI * Math.pow(super.radio,2) * altura;
        return volumen;
    }


}
