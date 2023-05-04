package f1_classroom_04_05_23;

import java.util.Scanner;

public class c1_exercise {
    public static void main(String args[]){
        //IMPORTS
            Scanner input = new Scanner(System.in);
        //IMPORTS
        
        //VARIABLES
            int operation;
            double buyValue;
        //VARIABLES
        
        System.out.println("Sistema de desconto!");
        System.out.println("FORMAS DE PAGAMENTO");
        System.out.println("1. DINHEIRO");
        System.out.println("2. DÉBITO");
        System.out.println("3. CRÉDITO");
        System.out.println("4. OUTRO");
        
         operation = input.nextInt();
        
        switch(operation){
            case 1:
                System.out.println("Informe o valor da compra: ");
                buyValue = input.nextDouble();          
                System.out.println("Método com desconto 30% de desconto: " +(buyValue -(buyValue * 0.30)));
            break;
            case 2: 
                System.out.println("Informe o valor da compra: ");
                buyValue = input.nextDouble();          
                System.out.println("Método com desconto 25% de desconto: " +(buyValue -(buyValue * 0.25)));
            break;
            case 3: 
                System.out.println("Informe o valor da compra: ");
                buyValue = input.nextDouble();          
                System.out.println("Método com desconto 20% de desconto: " +(buyValue -(buyValue * 0.20)));
            break;
            case 4: 
                System.out.println("Informe o valor da compra: ");
                buyValue = input.nextDouble();          
                System.out.println("Método sem desconto: " + buyValue);
            break;
            default:
                System.out.println("OPERAÇÃO INVÁLIDA");
        }
        
    }
}
