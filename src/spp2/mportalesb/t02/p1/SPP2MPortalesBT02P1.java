/*Maythe Portales Barrios
 * IIS- A01411461
Tarea 2- Problema 1
 */
package spp2.mportalesb.t02.p1;

import java.util.Scanner;

/**
 *
 * @author may37
 */
public class SPP2MPortalesBT02P1 {

    /**
     * e * @param args the command line arguments
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double sue = 0, sc, phe;
        int he = 0;
        boolean flag;
        System.out.println("Calculadora de pago de para el trabajador");
        do {
            try {
                System.out.println("Ingrese su sueldo");
                sue = teclado.nextDouble();
                flag = false;
            } catch (Exception ex) {
                System.out.println("No es una cantidad");
                flag = true;
                teclado.next();
            }
        } while (flag);

        phe = categorias();

        do {
            try {
                System.out.println("Ingrese las horas extras trabajadas");
                he = teclado.nextInt();
                flag = false;
            } catch (Exception ex) {
                System.out.println("No es una cantidad");
                flag = true;
                teclado.next();
            }
        } while (flag);

        sc = (he * phe) + sue;
        System.out.println("El pago es " + sc);

    }

    static double categorias() {
        Scanner teclado = new Scanner(System.in);
        int cate = 0;
        double phe = 0;
        boolean flag;
        do {
            try {
                System.out.println("Ingresa una categoria");
                cate = teclado.nextInt();
                flag = false;
            } catch (Exception ex) {
                System.out.println("NO es un numero de categoria ");
                flag = true;
                teclado.next();
            }
        } while (flag);

        if (cate == 1) {
            phe = 30;
        } else if (cate == 2) {
            phe = 38;
        } else if (cate == 3) {
            phe = 50;
        } else if (cate == 4) {
            phe = 70;
        } else if (cate == 5) {
            phe = 90;
        } else if (cate == 6) {
            phe = 110;
        } else if (cate == 7) {
            phe = 130;
        } else if (cate == 8) {
            phe = 150;
        } else {
            System.out.println("OPCION NO VALIDA, solo de 1 a 8");
            categorias();
        }
        return phe;
    }
}
