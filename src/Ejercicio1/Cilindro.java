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

//En el método calcularVolumen podes
// devolver la cuenta -> return Math.PI * Math.pow(super.radio,2) * altura.*/
   /*public double calcularVolumen(){
        double volumen = Math.PI * Math.pow(super.radio,2) * altura;
        return volumen;
    }*/
    //corregido
   /* public double calcularVolumen(){
        return Math.PI * Math.pow(super.radio,2) * altura;
    }*/



    public double calcularArea() {
        return ((2 * Math.PI * super.getRadio() * this.altura) + (2 * super.calcularArea()));
    }

    public double calcularVolumen() {
        return super.calcularArea() * this.altura;
    }




}
