class Cheque {
    private String nombreCliente;
    private double valorCheque;
    private double comisionBanco;
    private String nombreBanco;
    public Cheque(String nombreCliente, double valorCheque,String nombreBanco) {
        this.nombreCliente = nombreCliente;
        this.valorCheque = valorCheque;
        this.nombreBanco= nombreBanco;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getValorCheque() {
        return valorCheque;
    }

    public void setValorCheque(double valorCheque) {
        this.valorCheque = valorCheque;
    }

    public void setNombreBanco(String nombreBanco){
        this.nombreBanco=nombreBanco;
    }
    public String getNombreBanco(){
        return nombreBanco;
    }

    public void calcularComisionBanco() {
        this.comisionBanco = 0.00003 * this.getValorCheque();
    }

    public double getComisionBanco() {
        return comisionBanco;
    }

    public String toString() {
        return String.format("DATOS"+
                        "\nNombre Banco: %s"+
                        "\nCliente: %s"+
                        "\nValor del Cheque: %.2f"+
                        "\nComision del Banco: %.2f",
                this.getNombreBanco(),this.nombreCliente,this.getValorCheque(),this.getComisionBanco());
    }
}
public class TestEntidadFinanciera {
    public static void main(String[] args) {
        Cheque cheque=new Cheque("Iam",12000,"BanLoja");
        cheque.calcularComisionBanco();
        System.out.print(cheque);
    }
}
