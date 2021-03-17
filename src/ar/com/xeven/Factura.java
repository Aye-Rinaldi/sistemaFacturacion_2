package ar.com.xeven;


import java.util.ArrayList;
import java.util.List;

public class Factura {
    //atributos
    private List<Item> items;
    private Double descuento;

    //constructor 1 vacio
    public Factura() {
        items = new ArrayList<>();
        descuento = 0.0;
    }

    //creo otro constructor al que le paso la lista de items
    public Factura(List<Item> itemsNuevos) {
        this.items = itemsNuevos;

    }

    //getters y setters
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    //metodo para calcular el monto de cada factura sin descuento
    public Double consultarMontoSinDescuento(){
       Double montoSinDescuento = 0.0;
       for (Item i:items){
           montoSinDescuento = i.subtotalPorItem();
       }
       return montoSinDescuento;
    }

    //monto con iva incluido y descuentos (si hay)
    public Double consultarMontoFinal(){
        Double montoFinal = consultarMontoSinDescuento();
        montoFinal = montoFinal * 1.21;
        if (descuento > 0){
            montoFinal = montoFinal - (montoFinal*descuento);
        }
        return montoFinal;
    }
}
