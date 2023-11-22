package taller_6;

import java.util.Scanner;

public class Problema_6 {

    public static void main(String[] args) {
        int op;
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese un numero sea el 1,2,3,4");
        op = dato.nextInt();
        switch (op) {
            case 1:
                System.out.println("Suma");
                break;
            case 2:
                System.out.println("Resta");
                break;
            case 3:
                System.out.println("Multiplicacion");
                break;
            case 4:
                System.out.println("Divicion");
                break;
        }
    }
}
