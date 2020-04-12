package Ejercicio2;
/*Y finalmente tenemos al miembro de Staff que también es una Persona pero
con características propias de alguien que trabaja para una institución, por ejemplo
salario y turno, este puede ser mañana o noche.*/
public class Staff extends Person{
    private double salary;
    private String turn; //puede ser mañana o noche

    public Staff(String dni, String name, String surname, String email, String direction, double salary, String turn) {
        super(dni, name, surname, email, direction);
        this.salary = salary;
        this.turn = turn;
    }

    public Staff() {
        super();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getTurn() {
        return turn;
    }

    public void setTurn(String turn) {
        this.turn = turn;
    }

    @Override
    public String toString() {
        return super.toString()+"Staff{" +
                "salary=" + salary +
                ", turn='" + turn + '\'' +
                '}';
    }

    public double salaryAnual(){
        double salaryAnual;
        return salary = salary*12;
    }


}
   /* public String toString() {
        return super.toString()+" salary = "+salary+", turn = " + turn;
    }*/