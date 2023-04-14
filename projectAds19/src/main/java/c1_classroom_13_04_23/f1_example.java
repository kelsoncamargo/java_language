
package c1_classroom_13_04_23;

import java.util.Scanner;

public class f1_example {
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Idade - usuário 1: ");
        int age1 = input.nextInt();
        System.out.print("Idade - usuário 2: ");
        int age2 = input.nextInt();
        
        int rest1 = age1 % 2;
        int rest2 = age2 % 2;
        
        if((rest1 == 0) || (rest2 == 0)){
            double totalPay = 60 - (60 * 0.3);
            System.out.println("Total: R$ " + totalPay);
        }else{
            System.out.println("Total: R$ 60,00");
        }
    }
}
