package e1_classroom_27_04_23;

import java.util.Scanner;

public class b1_work {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Dígite um número inteiro maior ou igual a 100 e menor ou igual a 999: ");
        int num = input.nextInt();
        
        if((num >= 100) && (num <= 999)){
            int alg1 = num / 100;
            int alg2 = (num % 100) / 10;
            int alg3 = (num % 100) % 10;  
            System.out.println("A soma do " + num + " é igual a " + (alg1 + alg2 + alg3) );
        }else{
            System.out.println("O valor digitado é inválido!");
        }
    }
}
