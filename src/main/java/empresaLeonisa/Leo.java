package empresaLeonisa;

public class Leo extends Producto implements ProntoPagable, Cashable {

    public void decsProntoPago() {
        System.out.println("Aqui se realizara el descuento pronto pago");
    }


    public void descPagoEfectivo() {
        System.out.println("Aqui se realizara el pago en efectivo");
    }

}
