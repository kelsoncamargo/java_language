package d1_classroom_20_04_23;

import java.util.Scanner;

public class e1_exercise {
    public static void main(String args[]){
       Scanner input = new Scanner(System.in);
       
       System.out.println("Informa o valor que deseja sacar(Múltiplo de R$: 5): ");
       int cashDrawall = input.nextInt();
       
       int restDivide;
       int amountBankNotes;
     
        amountBankNotes = cashDrawall / 100;
        restDivide = cashDrawall % 100;

        amountBankNotes = restDivide / 50;
        restDivide = restDivide % 50;

        amountBankNotes = restDivide / 20;
        restDivide = restDivide % 20;

        amountBankNotes = restDivide / 10;
        restDivide = restDivide % 10;

        amountBankNotes = restDivide / 5;
        
        
        if(restDivide == 3 || restDivide == 1){
            amountBankNotes = cashDrawall / 100;
            System.out.println("Notas de R$ 100: " + amountBankNotes);
            restDivide = cashDrawall % 100;

            amountBankNotes = restDivide / 50;
            System.out.println("Notas de R$ 50: " + amountBankNotes);
            restDivide = restDivide % 50;

            amountBankNotes = restDivide / 20;
            System.out.println("Notas de R$ 20: " + amountBankNotes);
            restDivide = restDivide % 20;

            amountBankNotes = restDivide / 10;
            System.out.println("Notas de R$ 10: " + amountBankNotes);
            restDivide = restDivide % 10;

            amountBankNotes = restDivide / 2;
            System.out.println("Notas de R$ 2: " + restDivide);
        }
    } 
}
