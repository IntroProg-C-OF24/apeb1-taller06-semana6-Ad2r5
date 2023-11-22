package taller_6;

import java.util.Scanner;

public class Problema_3 {

    public static void main(String[] args) {
        double peso, Envio;
        String region;
        Scanner tecla = new Scanner(System.in);
        System.out.println("Ingrese el peso de su paquete: ");
        peso = tecla.nextDouble();
        System.out.println("Ingrese el lugar de donde proviene su paquete: ");
        region = tecla.next();
        Envio = 0;
        if (peso < 5 && region.equalsIgnoreCase("local")) {
            Envio = 5;
        } else if (peso >= 5 && peso <= 10 && region.equalsIgnoreCase("nacional")) {
            Envio = 10;
        } else {
            Envio = 15;
        }
        System.out.println("El Total por su paquete es " + Envio);
        tecla.close();
        }
    }

