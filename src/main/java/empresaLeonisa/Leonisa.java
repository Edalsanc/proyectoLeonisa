package empresaLeonisa;

public class Leonisa extends Producto implements ProntoPagable {

    public Leonisa(String ciu, int precio, String tipoPrenda, String talla, String color, String material) {
        super(ciu, precio, tipoPrenda, talla, color, material);
    }

    public Leonisa() {
    }

    public void decsProntoPago() {

    }
}
