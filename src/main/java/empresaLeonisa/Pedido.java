package empresaLeonisa;

public class Pedido {
    private int cantidadUnidad;
    private String mediDePago;
    private double descuento;
    private int prontoPago;


    public Pedido() {
    }

    public Pedido(int cantidadUnidad, String mediDePago, double descuento, int prontoPago) {
        this.cantidadUnidad = cantidadUnidad;
        this.mediDePago = mediDePago;
        this.descuento = descuento;
        this.prontoPago = prontoPago;
    }


    public void asignarProducto(Leonisa leonisa){

    }

    public void asignarProducto(Leo leo){

    }

    public void asignarProducto(Teen teen){

    }

    public int getCantidadUnidad() {
        return cantidadUnidad;
    }

    public String getMediDePago() {
        return mediDePago;
    }

    public double getDescuento() {
        return descuento;
    }

    public int getProntoPago() {
        return prontoPago;
    }
}
