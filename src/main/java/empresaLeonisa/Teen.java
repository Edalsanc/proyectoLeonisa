package empresaLeonisa;

public class Teen extends Producto implements Cashable {

    public Teen(String ciu, int precio, String tipoPrenda, String talla, String color, String material) {
        super(ciu, precio, tipoPrenda, talla, color, material);
    }

    public Teen() {
    }

    public void descPagoEfectivo() {

    }
}
