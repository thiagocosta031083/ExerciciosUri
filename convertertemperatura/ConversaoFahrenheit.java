
package convertertemperatura;

import java.util.Scanner;


public class ConversaoFahrenheit {
    public double F, C=0;
    
    Scanner ler = new Scanner (System.in);
    public void converterFahrenheit(){
        System.out.println("Digite a temperatura fahrenheit a ser convertida: ");
            F = ler.nextDouble();
            C = (F-32)/1.8;
        System.out.println("A temperatura em Celsios é de: "+C);
    }
}
