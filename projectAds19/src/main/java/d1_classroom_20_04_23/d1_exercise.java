package d1_classroom_20_04_23;

import java.util.Scanner;

public class d1_exercise {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Maior e Menor Número");
        System.out.println("Informe o primeiro número: ");
        double num1 = input.nextDouble();
        System.out.println("Informe o segundo número: ");
        double num2 = input.nextDouble();
        System.out.println("Informe o terceiro número: ");
        double num3 = input.nextDouble();
          
        
        if(num1 > num2 && num1 > num3){
            System.out.println("O Primeiro número é o maior");
            if(num2 < num3){
                System.out.println("O segundo número é o menor");
            }else{
                System.out.println("O terceiro número é o menor");
            }
        }else{
            if(num2 > num1 && num2 > num3){
                System.out.println("O Segundo número é o maior");      
                if(num1 < num3){
                    System.out.println("O Primeiro número é o menor");
                }else{
                    System.out.println("O Terceiro número é o menor");
                }
            }else{
                if(num3 > num1 && num3 > num2){
                    System.out.println("O Terceiro número é o maior");      
                    if(num1 < num2){
                        System.out.println("O Primeiro número é o menor");
                    }else{
                        System.out.println("O Segundo número é o menor");
                    }
                }
           }
        }
    }
}
