public class Presupuesto {
    private String cliente, descripcion;
    private double importe;

    public Presupuesto() {
        cliente = "";
        descripcion = "";
        importe = 0;
    }

    public Presupuesto(String cliente, String descripcion, double importe){
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.importe = importe;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public void imprimirPresupuesto(){
        System.out.println("Cliente: " + cliente);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Importe: " + importe);
    }
}
