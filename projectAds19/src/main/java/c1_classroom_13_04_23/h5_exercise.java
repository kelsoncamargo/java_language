
package c1_classroom_13_04_23;

import java.util.Scanner;

public class h5_exercise {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número x: ");
        int  x = input.nextInt();
        System.out.print("Digite o segundo número y: ");
        int  y = input.nextInt();
        
        int c = x;
        x = y;
        y = c;
        
        System.out.println("O valor de x = y é : " + x + " O valor de y = x é : " + y);
                
    }   
}
