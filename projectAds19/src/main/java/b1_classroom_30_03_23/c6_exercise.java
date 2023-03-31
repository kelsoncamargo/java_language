
package b1_classroom_30_03_23;

import java.util.Scanner;

public class c6_exercise {
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Calcula Minutos");
        
        System.out.print("Quando segundos já tem desde o início do dia?");
        int seg = input.nextInt();
        
        int calcHour = seg / 3600;
        int calcMin = (seg % 3600) / 60;
        int calcSeg = (seg % 3600) % 60 ;
        System.out.print("Desde que dia iniciou já se passou: " + calcHour + " Horas e " + calcMin + " minutos e " + calcSeg + "segundos");
    
    }
}
