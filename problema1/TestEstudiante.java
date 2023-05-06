class Estudiante{
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;

    public Estudiante(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getPromedio() {
        return promedio;
    }

    public void calcularPromedio(){
        this.promedio=(this.nota1+this.nota2+this.nota3)/3;
    }

    public String toString(){
        return String.format("DATOS "+
                "\nNombre: %s"+
                "\nNota 1: %.2f"+
                "\nNota 2: %.2f"+
                "\nNota 3: %.2f"+
                "\nPromedio: %.2f",this.getNombre(),this.getNota1(),this.getNota2(),this.getNota3(),this.getPromedio());
    }
}


public class TestEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante= new Estudiante("Iam",7,7,9);
        estudiante.calcularPromedio();
        System.out.println(estudiante);
    }
}