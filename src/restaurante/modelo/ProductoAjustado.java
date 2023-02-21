package restaurante.modelo;

import java.util.ArrayList;

public class ProductoAjustado implements Producto {
    private ProductoMenu base;
    private ArrayList<Ingrediente> agregados;
    private ArrayList<Ingrediente> eliminados;

    public ProductoAjustado(ProductoMenu base, ArrayList<Ingrediente> agregados, ArrayList<Ingrediente> eliminados) {
        this.base = base;
        this.agregados = agregados;
        this.eliminados = eliminados;
    }

    public ProductoMenu getBase() {
        return base;
    }

    public void setBase(ProductoMenu base) {
        this.base = base;
    }

    public ArrayList<Ingrediente> getAgregados() {
        return agregados;
    }

    public void setAgregados(ArrayList<Ingrediente> agregados) {
        this.agregados = agregados;
    }

    public ArrayList<Ingrediente> getEliminados() {
        return eliminados;
    }

    public void setEliminados(ArrayList<Ingrediente> eliminados) {
        this.eliminados = eliminados;
    }

    @Override
    public int getPrecio() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String getNombre() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String generarTextoFactura() {
        // TODO Auto-generated method stub
        return null;
    }

}
