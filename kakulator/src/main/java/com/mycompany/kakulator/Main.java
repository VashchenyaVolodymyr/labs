/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kakulator;

import java.util.Scanner;

// калькулятор считает модули от операций над двумя числами
public class Main {
    public static void main(String[] args)  {
                Scanner in = new Scanner(System.in);
                System.out.print("A =  ");
                double A = in.nextDouble();
                System.out.print("B = ");
                double B = in.nextDouble();
                System.out.print("Mod =  ");
                double mod = in.nextDouble();

                System.out.print("For + : ");
                System.out.println((A + B) % mod);
                System.out.print("For - : ");
                System.out.println((A - B) % mod);
                System.out.print("For / : ");
                System.out.println((A / B) % mod);
                System.out.print("For * :");
                System.out.println((A * B) % mod);
                System.out.print("For ^ : ");
                System.out.println((Math.pow(A, B)) % mod);
        }
}
