package empresaLeonisa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoriaTest {
    private Categoria c;

    @Before
    public void setUp() throws Exception {
        c = new Categoria("boxer", "m", "azul", "lana");
    }

    @Test
    public void Categotia() {
        Assert.assertNotNull(c);
    }

    @Test
    public void getTipoPrenda() {
        Assert.assertEquals("No es la prenda correcta", "boxer", c.getTipoPrenda());
    }

    @Test
    public void getTalla() {
        Assert.assertEquals("No es la talla correcta", "m", c.getTalla());
    }

    @Test
    public void getColor() {
        Assert.assertEquals("No es el color correcto", "azul", c.getColor());
    }

    @Test
    public void getMaterial() {
        Assert.assertEquals("No es el material correcto", "lana", c.getMaterial());
    }
}
