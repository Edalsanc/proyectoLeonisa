package empresaLeonisa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Vector;
public class PedidoTest {

    Vector<Object> pedido;
    private Pedido pedidoLeonisa;
    private Pedido pedidoLeo;
    private Pedido pedidoTeen;
    private Pedido p;

    private Leonisa leonisa;
    private Leo leo;
    private Teen teen;


    @Before
    public void setUp() throws Exception {
        pedido = new Vector<Object>();
        pedidoLeonisa = new Pedido ();
        pedidoLeo=new Pedido();
        pedidoTeen= new Pedido();
        Pedido p = new Pedido();

        leonisa = new Leonisa("01", 25000, "medias", "m", "Negro", "Algodón");
        leo = new Leo("01", 25000, "medias", "m", "Negro", "Algodón");
        teen = new Teen("01", 25000, "medias", "m", "Negro", "Algodón");

        pedido.add(leonisa);
        pedido.add(leo);
        pedido.add(teen);

    }

    @Test
    public void asignarProducto() {
        boolean asignadoLeonisa = pedido.contains(leonisa);
        Assert.assertTrue("No se ha asignado un producto 'Leonisa' al pedido", asignadoLeonisa);

    }

    @Test
    public void testAsignarProducto() {
        boolean asignadoLeo = pedido.contains(leo);
        Assert.assertTrue("No se ha asignado un producto 'Leo' al pedido", asignadoLeo);
    }

    @Test
    public void testAsignarProducto1() {
        boolean asignadoTeen = pedido.contains(teen);
        Assert.assertTrue("No se ha asignado un producto 'Teen' al pedido", asignadoTeen);
    }

    @Test
    public void totalCompra() {

    }

    @Test
    public void testTotalCompra() {
    }

    @Test
    public void testTotalCompra1() {
    }
}