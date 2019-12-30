package empresaLeonisa;

import java.util.Vector;

public class Pedido {

    private Categoria cat;
    private int cantidadUnidad;
    private Producto pro;

    Vector<Producto> pedido = new Vector<Producto>();
    Vector<Object> totalLeonisa = new Vector<Object>();
    Vector<Object> totalLeo = new Vector<Object>();
    Vector<Object> totalTeen = new Vector<Object>();
    Vector<Object> totalCompra = new Vector<Object>();


    public Pedido(Producto pro) {
        this.pro = pro;
    }

    public Pedido(int cantidadUnidad, Categoria cat, Producto pro) {
        this.cantidadUnidad = cantidadUnidad;
        this.pro = pro;
        this.cat = cat;
    }

    public Pedido() {
    }

    public Vector<Producto> getPedido() {
        return pedido;
    }

    public Vector<Object> getTotalLeonisa() {
        return totalLeonisa;
    }

    public Vector<Object> getTotalLeo() {
        return totalLeo;
    }

    public Vector<Object> getTotalTeen() {
        return totalTeen;
    }

    public void asignarProducto(Leonisa leonisa) {

        pedido.add(leonisa);

    }

    public void asignarProducto(Leo leo) {
        pedido.add(leo);

    }

    public void asignarProducto(Teen teen) {
        pedido.add(teen);
    }

    public void CompraLeonisa(Leonisa leonisa, int cantidadUnidad) {

        totalLeonisa.add(cantidadUnidad * leonisa.getPrecio());

    }

    public void CompraLeo(Leo leo, int cantidadUnidad) {

        totalLeo.add(cantidadUnidad * leo.getPrecio());

    }

    public void CompraTeen(Teen teen, int cantidadUnidad) {

        totalTeen.add(cantidadUnidad * teen.getPrecio());

    }

    public Producto buscarProducto(String ciu) {
        for (Producto pro : pedido) {
            if (pro.getCiu() == ciu) {
                return pro;
            }
        }
        return null;

    }

    public Object totalCompra(Producto pedido) {

        while (this.pedido != null) {

            totalCompra.add(totalLeonisa);
            totalCompra.add(totalLeo);
            totalCompra.add(totalTeen);

        }
        return totalCompra;
    }

}
