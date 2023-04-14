
package c1_classroom_13_04_23;

import java.util.Scanner;

public class h7_exercise {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número x: ");
        double  x = input.nextDouble();
        
        if(!!(x > 0)){
            System.out.println("É positivo");
        }
        if(!!(x == 0)){
            System.out.println("É igual a zero");
        }
        if(!!(x < 0)){
           System.out.println("É negativo"); 
        }
    }   
}
