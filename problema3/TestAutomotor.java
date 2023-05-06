class Automotor{
    private String cedula;
    private String marcaVehiculo;
    private int anioFabricacion;
    private double valorVehiculo;
    private double valorMatricula;

    public Automotor(String cedula, String marcaVehiculo, int anioFabricacion, double valorVehiculo) {
        this.cedula = cedula;
        this.marcaVehiculo = marcaVehiculo;
        this.anioFabricacion = anioFabricacion;
        this.valorVehiculo = valorVehiculo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getValorVehiculo() {
        return valorVehiculo;
    }

    public void setValorVehiculo(double valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
    }

    public void calcularValorMatricula(){
        this.valorMatricula= (this.valorVehiculo*0.00002)*(2023-anioFabricacion);
    }
    public double getValorMatricula(){
        return this.valorMatricula;
    }

    public String toString(){
        return String.format("AUTOMOTOR"+
                        "\nCedula: %s"+
                        "\nMarca del Vehiculo: %s"+
                        "\nAño de fabricacion: %d"+
                        "\nPrecio del vehiculo: %.2f"+
                        "\nValor de la matricula: %.2f",
                this.getCedula(),this.getMarcaVehiculo(),this.getAnioFabricacion(),this.getValorVehiculo(),this.getValorMatricula());
    }
}

public class TestAutomotor {
    public static void main(String[] args) {
        Automotor automotor= new Automotor("1104599376", "Toyota", 2012,12000);
        automotor.calcularValorMatricula();
        System.out.println(automotor);

    }
}