/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Jeiison
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Scanner sc = new Scanner(System.in);
         int opc;
        do {
            System.out.println("Ingrese una opcion\n1-Para sumar\n2-Para restar\n3-Para Multiplicar\n4-Para Dividir\n5-Para salir");
        opc = sc.nextInt();
        switch (opc) {
            case 1:
                System.out.println("Ingrese el numero 1");
                int num1 = sc.nextInt();
                System.out.println("Ingrese el numero 2");
                int num2 = sc.nextInt();
                int res = suma(num1, num2);
                System.out.println("El resultado es: " + res);
                break;

            case 2:
                System.out.println("Ingrese el numero 1");
                int num3 = sc.nextInt();
                System.out.println("Ingrese el numero 2");
                int num4 = sc.nextInt();
                int resu = resta(num3, num4);
                System.out.println("El resultado es: " + resu);
                break;

            case 3:
                System.out.println("Ingrese el numero 1");
                int num5 = sc.nextInt();
                System.out.println("Ingrese el numero 2");
                int num6 = sc.nextInt();
                int resuL = multiplicar(num5, num6);
                System.out.println("El resultado es: " + resuL);
                break;

            case 4:
                System.out.println("Ingrese el numero 1");
                int num7 = sc.nextInt();
                System.out.println("Ingrese el numero 2");
                int num8 = sc.nextInt();
                double resul = dividir(num7, num8);
                System.out.println("El resultado es: " + resul);
                break;
            case 5:
                System.out.println("Salio del programa");
                break;
            default:
                System.out.println("No ingreso una opcion valida");
                break;
        }
        
        } while (opc!=5 && opc<6);
    
    }

    public static int suma(int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }

    public static int resta(int num1, int num2) {
        int resultado = num1 - num2;
        return resultado;
    }

    public static int multiplicar(int num1, int num2) {
        int resultado = num1 * num2;
        return resultado;
    }

    public static double dividir(int num1, int num2) {
        double resultado = num1 / num2;
        return resultado;
    }
}
