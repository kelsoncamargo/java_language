package f1_classroom_04_05_23;

import java.util.Scanner;

public class a1_example {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Caixa Eletrônico");
        System.out.println("Opções");
        System.out.println("1. Saldo");
        System.out.println("2. Depósito");
        System.out.println("3. Saque");
        System.out.println("4. Sair");
        System.out.println("Escolha uma opção: ");
        int option = input.nextInt();
        
        switch(option){
            case 1: System.out.println("SEU SALDO É:");
                break;
            case 2: System.out.println("QUAL É O VALOR DO DEPÓSITO?:");
                break;
            case 3: System.out.println("QUAL É O VALOR DO SAQUE?:");
                break;
            case 4: System.out.println("O CAIXA AGRADECE");
                break; 
            default: System.out.println("OPÇÃO INVÁLIDA!");
        }        
    }
}
