
package c1_classroom_13_04_23;

import java.util.Scanner;

public class h1_exercise {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int  x = input.nextInt();
        
        if(x % 2 == 0){
            System.out.println("O número: " + x + " é par");
        } else{
            System.out.println("O número: " + x + " é ímpar");
        }
    }   
}
