
package c1_classroom_13_04_23;

import java.util.Scanner;

public class h3_exercise {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite os pontos do primeiro time número: ");
        int  x = input.nextInt();
        System.out.print("Digite os pontos do segundo time número: ");
        int  y = input.nextInt();
        
        if(!!(x == y)){
            System.out.println("Empate!");
        }
        if(!!(x > y)){
            System.out.println("O primeiro time ganhou!");      
        }
        else{
            System.out.println("O segundo time ganhou!");
        }
    }   
}
