package empresaLeonisa;

public class Leo extends Producto implements Cashable,ProntoPagable {

    public Leo(String ciu, int precio, String tipoPrenda, String talla, String color, String material) {
        super(ciu, precio, tipoPrenda, talla, color, material);
    }

    public Leo() {
    }

    public void descPagoEfectivo() {

    }

    public void decsProntoPago() {

    }
}
