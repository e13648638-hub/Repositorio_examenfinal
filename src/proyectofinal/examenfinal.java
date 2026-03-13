/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

import java.util.Scanner;

/**
 *
 * @author Elizabeth
 */
public class examenfinal {
public static void main(String[] args) {
        String cliente;
        double compra1, compra2, compra3;
        double tc, pc;
        double desc;
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese nombre del cliente: ");
        cliente = lectura.nextLine();
        System.out.print("Ingrese compra 1: ");
        compra1 = lectura.nextDouble();
        System.out.print("Ingrese compra 2: ");
        compra2 = lectura.nextDouble();
        System.out.print("Ingrese compra 3: ");
        compra3 = lectura.nextDouble();
        tc = compra1 + compra2 + compra3;
        pc = tc / 3;
        desc = tc * 0.10;
        System.out.println("Cliente: " + cliente);
        System.out.println("Total compras: " + tc);
        System.out.println("Promedio compras: " + pc);
        System.out.println("Descuento aplicado: " + desc);
        
    }    
}
