package Ejercicio2;

public class Person {
    private String dni;
    private String name;
    private String surname;
    private String email;
    private String direction;

    public Person(String dni, String name, String surname, String email, String direction) {
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.direction = direction;
    }
    public Person() {
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "dni = "+dni+", name = "+ name +", surname = "+ surname +", email = "+email+", diretcion = "+ direction;
    }
}
