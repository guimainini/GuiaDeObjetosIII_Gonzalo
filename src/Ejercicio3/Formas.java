package Ejercicio3;

public abstract class Formas {
    protected boolean color;

    public Formas(boolean color) {

        this.color = true;
    }
    public Formas() {
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public abstract double area();
    public abstract double perimetro();




}
