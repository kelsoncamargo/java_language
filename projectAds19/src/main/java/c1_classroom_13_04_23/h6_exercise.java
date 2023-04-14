
package c1_classroom_13_04_23;

import java.util.Scanner;

public class h6_exercise {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número x: ");
        int  x = input.nextInt();
        
        if( x % 5 == 0){
            System.out.println("É multiplo de 5");
        }else{
           System.out.println("Não é multiplo de 5"); 
        }
    }   
}
