public class Factura extends Presupuesto {
    private final String fabricante;

    public Factura(){
        super();
        fabricante = "Productos ACME S.L.";
    }

    public Factura(String fabricante){
        this.fabricante = fabricante;
    }

    public Factura(String cliente, String descripcion, double importe) {
        super(cliente,descripcion, importe);
        fabricante = "Productos ACME S.L.";
    }

    public double obtenerPrecioOficial(){
        final double iva = 0.21;
        double precioOfical = (super.getImporte()*iva) + super.getImporte();
        return precioOfical;
    }

    @Override
    public void imprimirPresupuesto(){
        super.imprimirPresupuesto();
        System.out.println("Importe + IVA: " + obtenerPrecioOficial());
        System.out.println("Fabricante: " + fabricante);
        
    }
}

