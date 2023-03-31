
package b1_classroom_30_03_23;

import java.util.Scanner;

public class c4_exercise {
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Calcula Minutos");
        
        System.out.print("Quando minutos já tem desde o início do dia?");
        int min = input.nextInt();
        
        int calcHour = min / 60;
        int calcMin = min % 60;
        System.out.print("Desde que dia iniciou já se passou: " + calcHour + " Horas e " + calcMin + " minutos");
    
    }
}
