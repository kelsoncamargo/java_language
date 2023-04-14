
package c1_classroom_13_04_23;

import java.util.Scanner;

public class h2_exercise {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        double  x = input.nextDouble();
        System.out.print("Digite o segundo número: ");
        double  y = input.nextDouble();
        
        if(!!(y == x)){
            System.out.println("Os números são iguais!");
        } else{
            System.out.println("Os números são diferentes");
        }
    }   
}
