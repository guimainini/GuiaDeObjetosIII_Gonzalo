package Ejercicio3;

public class Rectangulo extends Formas {
    private double altura;
    private double base;

    public Rectangulo(boolean color, double altura, double base) {
        super(color);
        this.altura = altura;
        this.base = base;
    }

    public Rectangulo() {
        super();
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }



    //b * h
    @Override
    public double calcularArea() {
        double area = base * altura;
        return area;
    }


    //2b + 2h
    @Override
    public double calcularPerimetro() {
        double perimetro = 2 * base + 2 * altura;
        return perimetro;
    }


}
