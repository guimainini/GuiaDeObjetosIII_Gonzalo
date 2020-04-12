package Ejercicio2;

public class Student extends Person {
    private int incomeYear;
    private int monthlyFee;
    private String collegeCareer;

    public Student(String dni, String nombre, String apellido, String email, String direccion, int incomeYear, int monthlyFee, String collegeCareer){
        super(dni,nombre,apellido,email,direccion);
        this.incomeYear = incomeYear;
        this.monthlyFee = monthlyFee;
        this.collegeCareer = collegeCareer;
    }
    public Student(){
        super();
    }

    public int getIncomeYear(){
        return incomeYear;
    }

    public void setIncomeYear(int incomeYear){
        this.incomeYear = incomeYear;
    }

    public int getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(int monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public String getCollegeCareer() {
        return collegeCareer;
    }

    public void setCollegeCareer(String collegeCareer) {
        this.collegeCareer = collegeCareer;
    }

    public static double sumar(Student mano){
        double total =+ mano.getMonthlyFee();
        return  total;
    }




    @Override
    public String toString() {
        return super.toString()+"Student{" +
                "incomeYear=" + incomeYear +
                ", monthlyFee=" + monthlyFee +
                ", collegeCareer='" + collegeCareer + '\'' +
                '}';
    }
}
   /* @Override
    public String toString() {
        return  super.toString()+" añoIngreso = "+ incomeYear +", cuotaMensual = "+ monthlyFee +", carrera ="+ collegeCareer;
    }*/