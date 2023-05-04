package f1_classroom_04_05_23;

import java.util.Scanner;

public class b1_exercise {
    public static void main(String args[]){
        //IMPORTS
            Scanner input = new Scanner(System.in);
        //IMPORTS
       
        //VARIABLES
            double num1;
            double num2; 
            int operation;
        //VARIABLES
                
        System.out.println("Calculadora Básica");
        System.out.println("Escolha uma das seguintes operações:");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Divisão");
        System.out.println("4. Multiplicação");
        System.out.println("Qual operação você deseja fazer:");
        operation = input.nextInt();
        
        switch(operation){
            case 1:
                System.out.println("Informe o primeiro número: ");
                num1 = input.nextDouble();
                System.out.println("Informe o segundo número: ");
                num2 = input.nextDouble();            
                System.out.println("O valor da soma de " + num1 + " + " + num2 + " = " + (num1 + num2));
            break;
            case 2: 
                System.out.println("Informe o primeiro número: ");
                num1 = input.nextDouble();
                System.out.println("Informe o segundo número: ");
                num2 = input.nextDouble();            
                System.out.println("O valor da subtração de " + num1 + " - " + num2 + " = " + (num1 - num2));
            break;
            case 3: 
                System.out.println("Informe o primeiro número: ");
                num1 = input.nextDouble();
                System.out.println("Informe o segundo número: ");
                num2 = input.nextDouble();            
                System.out.println("O valor da divisão de " + num1 + " / " + num2 + " = " + (num1 / num2));
            break;
            case 4: 
                System.out.println("Informe o primeiro número: ");
                num1 = input.nextDouble();
                System.out.println("Informe o segundo número: ");
                num2 = input.nextDouble();            
                System.out.println("O valor da multiplicação de " + num1 + " * " + num2 + " = " + (num1 * num2));
            break;
            default:
                System.out.println("OPERAÇÃO INVÁLIDA");
        }
    }
}
