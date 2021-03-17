package ar.com.xeven;

public class Item {
    //atributos
    private int nro;
    private String detalle;
    private int cantidad;
    private Double precioUnitario;

    //constructor
    public Item(int nro, String detalle, int cantidad, Double precioUnitario) {
        this.nro = nro;
        this.detalle = detalle;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    //getters y setters
    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    //subtotal
    public Double subtotalPorItem(){
        return precioUnitario * cantidad;
    }
}
