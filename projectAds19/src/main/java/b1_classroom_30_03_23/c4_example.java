
package b1_classroom_30_03_23;

import java.util.Scanner;

public class c4_example {
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Calcula Minutos");
        
        System.out.print("Quando minutos já tem desde o início do dia?");
        double min = input.nextDouble();
        
        double calcMin = min / 60;
        System.out.print("Desde que dia iniciou já se passou: " + calcMin + " 15Horas");
    
    }
}
