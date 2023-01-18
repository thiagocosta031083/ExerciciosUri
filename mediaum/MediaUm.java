/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediaum;
import java.util.Scanner;

/**
 Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno. 
 * A seguir, calcule a média do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto é 11). 
 * Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

Entrada
O arquivo de entrada contém 2 valores com uma casa decimal cada um.

Saída
Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 5 dígitos após o ponto decimal e com um espaço em branco antes e depois da igualdade. 
* Utilize variáveis de dupla precisão (double) e como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".
 */
public class MediaUm {

    
    public static void main(String[] args) {
       double notaA, notaB, peso1, peso2, MEDIA;
       Scanner ler = new Scanner (System.in);
       notaA = ler.nextDouble();
       notaB = ler.nextDouble();
       peso1 = notaA * 3.5;
       peso2 = notaB * 7.5;            
       MEDIA = (peso1 + peso2)/11;
       System.out.printf("MEDIA = %.5f%n",MEDIA); //printf + " retorno e %.5f%n" limita em 5 decimais
      
       }
       
    }
    

