package taller_6;

import java.util.Scanner;

public class Problema_1 {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int xbox;
        int cantidadiphone;
        int precioiPad;
        int precioiphone;
        int subpro1;
        int subpro2;
        int subtotal;
        double iva = 0.1;
        double subiva;
        double descuento;
        int envio;
        double total;
        System.out.println("Cuantas xbox quiere?");
        xbox = dato.nextInt();
        System.out.println("Cuantas iphones quiere?");
        cantidadiphone = dato.nextInt();
        System.out.println("Precio de xbox");
        precioiPad = dato.nextInt();
        System.out.println("Precio de iphones");
        precioiphone = dato.nextInt();
        System.out.println("Cuanto es el envio");
        envio = dato.nextInt();
        subpro1 = precioiPad * xbox;
        subpro2 = precioiphone * cantidadiphone;
        subtotal = subpro1 + subpro2;
        iva = subtotal * iva;
        subiva = subtotal + iva;
        if (subiva > 1000) {
            descuento = subiva * 0.2;
        } else {
            descuento = subiva * 0.05;
        }
        if (subtotal > 5000) {
            total = subiva - descuento;
            envio = 0;
            System.out.println("================");
            System.out.println("CANTIDAD DE XBOX: " + xbox);
            System.out.println("================");
            System.out.println("CANTIDAD DE IPHONE: " + cantidadiphone);
            System.out.println("================");
            System.out.println("PRECIO XBOX: " + precioiPad);
            System.out.println("================");
            System.out.println("PRECIO IPHONE: " + precioiphone);
            System.out.println("================");
            System.out.println("SUBTOTAL IPHONE: " + subpro1);
            System.out.println("================");
            System.out.println("SUBTOTAL IPHONE: " + subpro2);
            System.out.println("================");
            System.out.println("SUBTOTAL: " + subtotal);
            System.out.println("================");
            System.out.println("IVA: " + iva);
            System.out.println("================");
            System.out.println("SUBTOTAL + IVA: " + subiva);
            System.out.println("================");
            System.out.println("DESCUENTO: " + descuento);
            System.out.println("================");
            System.out.println("GASTOS DE ENVIO: " + envio);
            System.out.println("================");
            System.out.println("MONTO FACTURA: " + total);
        } else {
            total = subiva - descuento + envio;
            System.out.println("================");
            System.out.println("CANTIDAD DE XBOX: " + xbox);
            System.out.println("================");
            System.out.println("CANTIDAD DE IPHONE: " + cantidadiphone);
            System.out.println("================");
            System.out.println("PRECIO XBOX: " + precioiPad);
            System.out.println("================");
            System.out.println("PRECIO IPHONE: " + precioiphone);
            System.out.println("================");
            System.out.println("SUBTOTAL IPHONE: " + subpro1);
            System.out.println("================");
            System.out.println("SUBTOTAL IPHONE: " + subpro2);
            System.out.println("================");
            System.out.println("SUBTOTAL: " + subtotal);
            System.out.println("================");
            System.out.println("IVA: " + iva);
            System.out.println("================");
            System.out.println("SUBTOTAL + IVA: " + subiva);
            System.out.println("================");
            System.out.println("DESCUENTO: " + descuento);
            System.out.println("================");
            System.out.println("GASTOS DE ENVIO: " + envio);
            System.out.println("================");
            System.out.println("MONTO FACTURA: " + total);

        }
    
    }
}
