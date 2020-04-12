package Ejercicio2;

import java.util.Scanner;

/*Inicializar 4 estudiantes diferentes.
● Inicializar 4 miembros de staff con características diferentes.
● Crear un array que permita almacenar juntos los tipos anteriores y
almacenar las 8 instancias creadas anteriormente.
● Investigar el uso de la palabra reservada instanceof.
● Recorrer el array y mostrar por pantalla la cantidad de estudiantes y
la cantidad de miembros de staff.
● Recorrer el array y sumar el total de ingresos que percibe la
institución por parte de la cuota de estudiantes.*/
public class Main2 {
    public static void main(String[] args) {
        Student s1 = new Student("28468194", "Guillermo", "Mainini", "guimainini@gmail.com", "Almafuerte 2204", 2019, 2000, "TUP");
        Student s2 = new Student("27777777", "Natalia", "Goñi", "naty@gmail.com", "Almafuerte 2204", 2019, 1800, "TUP");
        Student s3 = new Student("30000000", "Facu", "Loscos", "facu@gmail.com", "Vucetich 2204", 2019, 2500, "TUP");
        Student s4 = new Student("24444444", "Juan", "Liñares", "juan@gmail.com", "Rawson 2204", 2019, 3000, "TUP");

        Staff f1 = new Staff("11111111", "Maria", "De Nasare", "maria@gmail.com", "Cielo 2204", 50000, "noche");
        Staff f2 = new Staff("22222222", "Jose", "De Nasare2", "jose@gmail.com", "Tierra 2204", 52000, "noche");
        Staff f3 = new Staff("33333333", "Espitiru", "De Nasare3", "espiritu@gmail.com", "Mar 2204", 54000, "tarde");
        Staff f4 = new Staff("44444444", "Santo", "De Nasare4", "santo@gmail.com", "Montaña 2204", 59000, "tarde");

        int accountantStudent = 0, accountantStaff = 0;
        double total = 0;
        //Ejemplo
        /*int numeros[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        for (int i : numeros) {
            System.out.println(i);*/

        // creo un arrglo de personas y agrego los 8 objetos
        Person[] memoria = new Person[]{s1, s2, s3, s4, f1, f2, f3, f4};

        //otra forma
        //Person[] memoria = {s1,s2,s3,s4,f1,f2,f3,f4};

        for (Person i : memoria) {
            System.out.println(i);
        }

       /* ● Investigar el uso de la palabra reservada instanceof.
          ● Recorrer el array y mostrar por pantalla la cantidad de estudiantes y
            la cantidad de miembros de staff.*/


        //recorro el arreglo de personas y con INSTANCEOF me devuelve cuantos estudiantes hay o profesores
        //true si hay . false si no hay
        for (Person e : memoria) {
            if (e instanceof Student) {
                accountantStudent++;
            }
            if (e instanceof Staff) {
                accountantStaff++;
            }
        }

        System.out.println("La cantidad de estudiantes es : " + accountantStudent);
        System.out.println("La cantidad de profesores es : " + accountantStaff);

        /*recorrer el array y sumar el total de ingresos que percibe la
        institución por parte de la cuota de estudiantes.*/

        //int sumar += s1.getMonthlyFee();

        for (Person e : memoria) {

            if (e instanceof Student) {
                //downcasting
                total += ((Student) e).getMonthlyFee();
            }
        }

        System.out.println("El total es : "+total);

    }
}
