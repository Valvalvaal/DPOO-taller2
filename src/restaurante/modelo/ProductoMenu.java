package restaurante.modelo;

public class ProductoMenu implements Producto {
    private String nombre;
    private int precioBase;

    public ProductoMenu(String nombre, int precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public int getPrecio() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String generarTextoFactura() {
        // TODO Auto-generated method stub
        return null;
    }

}
