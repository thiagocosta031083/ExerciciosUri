/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabuada;

import java.util.Scanner;

/**
Leia 1 valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N:      
1 x N = N      2 x N = 2N        ...       10 x N = 10N

Entrada
A entrada contém um valor inteiro N (2 < N < 1000).

Saída
Imprima a tabuada de N, conforme o exemplo fornecido.
 */
public class Tabuada {

    
    public static void main(String[] args) {
       int N, PROD1,PROD2, PROD3,PROD4, PROD5, PROD6, PROD7, PROD8, PROD9, PROD_10;
       Scanner ler = new Scanner (System.in);
       N = ler.nextInt();
       PROD1 = 1 * N;
       PROD2 = 2 * N;
       PROD3 = 3 * N;
       PROD4 = 4 * N;
       PROD5 = 5 * N;
       PROD6 = 6 * N;
       PROD7 = 7 * N;
       PROD8 = 8 * N;
       PROD9 = 9 * N;
       PROD_10 = 10 * N;
       System.out.println("1 x "+N +" = "+PROD1);
       System.out.println("2 x "+N +" = "+PROD2);
       System.out.println("3 x "+N +" = "+PROD3);
       System.out.println("4 x "+N +" = "+PROD4);
       System.out.println("5 x "+N +" = "+PROD5);
       System.out.println("6 x "+N +" = "+PROD6);
       System.out.println("7 x "+N +" = "+PROD7);
       System.out.println("8 x "+N +" = "+PROD8);
       System.out.println("9 x "+N +" = "+PROD9);
       System.out.println("10 x "+N +" = "+PROD_10); 
      
    }
    
}
