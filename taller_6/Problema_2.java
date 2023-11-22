package taller_6;

import java.util.Scanner;

public class Problema_2 {

    public static void main(String[] args) {
        double lado1, lado2, lado3, aux;
        Scanner tecla = new Scanner(System.in);
        // Entrada
        System.out.println("Ingrese el Lado 1: ");
        lado1 = tecla.nextDouble();
        System.out.println("Ingrese el Lado 2: ");
        lado2 = tecla.nextDouble();
        System.out.println("Ingrese el Lado 3: ");
        lado3 = tecla.nextDouble();
        if (lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado3 + lado1 > lado2) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Es Equilatero");
            } else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
                System.out.println("Es Isosceles");
            } else {
                System.out.println("Es Escaleno"); 
            }
        } else {
            System.out.println("No se considera Triangulo");
        }
        tecla.close();
    }
}

