package ar.com.xeven;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //lista de facturas
        List<Factura> facturas = new ArrayList<>();

        //creo una lista de items aqui
        List<Item> itemsNuevos = new ArrayList<>();
        //creo los items y los agrego
        itemsNuevos.add(new Item(1,"tuercas",18,30.00));
        itemsNuevos.add(new Item(2,"arandelas",18,12.0));
        itemsNuevos.add(new Item(3,"taladro",1,5800.0));
        //agrgeo la lista de items a la nueva factura que creo
        facturas.add(new Factura(itemsNuevos));

        //calculo el monto total vendido de todas las facturas
        Double montoTotalVendido = 0.0;
        for (Factura factura:facturas){
            Double montoFactura = factura.consultarMontoSinDescuento();
            montoTotalVendido += montoFactura;
            System.out.println("Factura por $: "+montoFactura);

        }
        System.out.println("Monto Total Venedido $: "+montoTotalVendido);

    }
}
