package empresaLeonisa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductoTest {
    private Producto p;
    @Before
    public void setUp() throws Exception {
        p = new Producto("01",2500,"boxer","m","rojo","algodon");
    }

    @Test
    public void getCiu() {
        Assert.assertEquals("No es el codigo no es correcto","01",p.getCiu());
    }

    @Test
    public void getPrecio() {
        Assert.assertEquals("no es el precio no es correcto ",2500,p.getPrecio());
    }

    @Test
    public void setPrecio() {
        p.setPrecio(2500);
        Assert.assertEquals("La asignacion del precio no es correcta",2500,p.getPrecio());
    }
}