package Ejercicio1;

public class Circulo {
    protected double radio = 1;
    private String color = "rojo";

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }
    public Circulo() {
    }

    public double getRadio(){
        return radio;
    }
    public void setRadio(double radio){
        this.radio = radio;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    //(A = π r²)

    public double calcularArea(){
        double area = Math.pow(radio,2) * Math.PI;
        return area;
    }


    //(2π×radius×height + 2×areaBase)

    /*public double calcularArea(double altura){
        double area = 2*Math.PI*altura + 2*calcularArea();
        return area;
    }*/

    @Override
    public String toString() {
        return "radio = "+radio+" color = "+color;
    }

}
