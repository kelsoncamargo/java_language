
package b1_classroom_30_03_23;

import java.util.Scanner;

public class c3_exercise {
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Calcula sua idade!");
        
        System.out.print("Dígite o ano em que nasceu: ");
        int yearBirth = input.nextInt();
        
        System.out.print("Dígite o ano em que você está hoje: ");
        int yearNow = input.nextInt();
        
        int age = yearNow - yearBirth;
        System.out.println("Você irá terminar o ano de " + yearNow + " com a idade de: " + age + " anos");
    }
    
}
