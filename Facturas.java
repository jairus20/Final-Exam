public class Facturas extends Comprobante {

    private Object rucFact;

    private Object subTotal;

    private Object fechaCancelacion;

    public Object getRucFact() {
        return rucFact;
    }

    public void setRucFact(Object rucFact) {
        this.rucFact = rucFact;
    }

    public Object getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Object subTotal) {
        this.subTotal = subTotal;
    }

    public Object getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(Object fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }
    
}
