/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extremamentebasico;

import java.util.Scanner;

/**
Leia 2 valores inteiros e armazene-os nas variáveis A e B. Efetue a soma de A e B atribuindo o seu resultado na variável X. Imprima X conforme exemplo apresentado abaixo. Não apresente mensagem alguma além daquilo que está sendo especificado e não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".

Entrada
A entrada contém 2 valores inteiros.

Saída
Imprima a mensagem "X = " (letra X maiúscula) seguido pelo valor da variável X e pelo final de linha. Cuide para que tenha um espaço antes e depois do sinal de igualdade, conforme o exemplo abaixo.o
 */
public class ExtremamenteBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    int A, B, X;
    Scanner ler = new Scanner (System.in);
    A = ler.nextInt();
    B = ler.nextInt();            
    X = A + B;    
    System.out.println("X = "+X);
    }
    
}
