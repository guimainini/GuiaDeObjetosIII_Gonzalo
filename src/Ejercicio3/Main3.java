package Ejercicio3;

import java.sql.SQLOutput;
import java.util.Scanner;

/*      Necesitamos crear un programa que nos permita crear diferentes tipos de figuras
        que poseen un color, estas figuras pueden o no estar coloreadas. Además
        necesitamos que las figuras tengan la posibilidad de calcular area y perimetro. Por
        el momento nos piden crear 2 Figuras, Círculo y Rectángulo. ambos deben contar
        con sus respectivas características, ya sea radio, alto, largo, etc. Y deben contar con
        los métodos de cálculo de area y perimetro implementados.

        ● Considerar si existe la posibilidad de crear un tipo abstracto que
        defina las características en común y que permita establecer qué
        métodos son mandatarios para las subclases.
        ● Los tipos deben contener diferentes constructores, por defecto y que
        inicialice diferentes atributos.
        ● Crear diferentes instancias de cada tipo e imprimir sus
        características.
        ● Nos piden agregar un nuevo tipo de forma, esta vez es un Cuadrado.
        Analice dónde es conveniente agregarlo en el árbol de herencia.
        Teniendo en cuenta evitar la duplicación de código innecesario.*/
public class Main3 {
    public static void main(String[] args) {
        char opcion,eleccion;
        int opcion2;
        boolean color = true;
        double radio,altura,base,lado;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Hola, buen dia, la figura que usted desea crear tiene lados (S/N) : ");
            opcion = entrada.next().charAt(0);


            if (opcion == 'N') {
                System.out.println(".:Usted desea ingresar un circulo:.");
                System.out.print("Digite el radio del circulo : ");
                radio = entrada.nextDouble();
                Formas circulo1 = new Circulo(radio,color);

                System.out.println("El circulo posee color : (S/N)");
                eleccion = entrada.next().charAt(0);
                if(eleccion=='N'){
                    circulo1.setColor(false);
                }

                System.out.println("El perimetor del circulo es : " + circulo1.perimetro()+"Su color es "+circulo1.isColor());
                System.out.println("El Area del circulo es : " + circulo1.area()+"su color es "+circulo1.isColor());
            } else if (opcion == 'S') {

                System.out.println(".:Usted desea ingresar un Rectagunlo o un cuadrado:.");
                System.out.println("1.Cuadrado");
                System.out.println("2.Rectangulo");
                opcion2 = entrada.nextInt();

                if(opcion2==2) {
                    System.out.println("Digite la base : ");
                    base = entrada.nextDouble();
                    System.out.println("Digite la altura : ");
                    altura = entrada.nextDouble();
                    Formas rectangulo1 = new Rectangulo(color,altura,base);

                    System.out.println("El circulo posee color : (S/N)");
                    eleccion = entrada.next().charAt(0);
                    if(eleccion=='N'){
                        rectangulo1.setColor(false);
                    }

                    System.out.println("El perimetro del rectangulo es :" + rectangulo1.perimetro()+" Y el color es "+rectangulo1.isColor());
                    System.out.println("El area del rectangulo es : " + rectangulo1.area()+"Y el color es "+rectangulo1.isColor());
                }else if (opcion2==1){
                    System.out.println("Ingrese un lado : ");
                    lado = entrada.nextDouble();
                    altura = base = lado;
                    Formas cuadrado1 = new Cuadrado(color,altura,base);

                    System.out.println("El circulo posee color : (S/N)");
                    eleccion = entrada.next().charAt(0);
                    if(eleccion=='N'){
                        cuadrado1.setColor(false);
                    }

                    System.out.println("El perimetro del Cuadrado es :" + cuadrado1.perimetro()+" Y el color es "+cuadrado1.isColor());
                    System.out.println("El area del Cuadrado es : " + cuadrado1.area()+" Y el color es "+cuadrado1.isColor());
                }


            }

        }while(opcion!='S' && opcion!='N');





    }





}
















