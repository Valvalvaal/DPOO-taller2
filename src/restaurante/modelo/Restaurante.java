package restaurante.modelo;

import java.util.ArrayList;

public class Restaurante {
    private ArrayList<Ingrediente> ingredientes;
    private ArrayList<ProductoMenu> menuBase;
    private ArrayList<Combo> combos;
    private ArrayList<Pedido> pedidos;
    private Pedido pedidoEnCurso;

    public Restaurante(ArrayList<Ingrediente> ingredientes, ArrayList<ProductoMenu> menuBase, ArrayList<Combo> combos,
            ArrayList<Pedido> pedidos, Pedido pedidoEnCurso) {
        this.ingredientes = ingredientes;
        this.menuBase = menuBase;
        this.combos = combos;
        this.pedidos = pedidos;
        this.pedidoEnCurso = pedidoEnCurso;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public ArrayList<ProductoMenu> getMenuBase() {
        return menuBase;
    }

    public void setMenuBase(ArrayList<ProductoMenu> menuBase) {
        this.menuBase = menuBase;
    }

    public ArrayList<Combo> getCombos() {
        return combos;
    }

    public void setCombos(ArrayList<Combo> combos) {
        this.combos = combos;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void addPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public Pedido getPedidoEnCurso() {
        return pedidoEnCurso;
    }

    public void setPedidoEnCurso(Pedido pedidoEnCurso) {
        this.pedidoEnCurso = pedidoEnCurso;
    }

}
