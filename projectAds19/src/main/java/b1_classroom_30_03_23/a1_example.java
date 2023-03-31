
package b1_classroom_30_03_23;

import java.util.Scanner;

public class a1_example {
    
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira o valor da base: ");
        double base = input.nextDouble();
        
        System.out.print("Insira o valor da altura: ");
        double height = input.nextDouble();
        
        double area = (base * height) / 2;
        System.out.println("O valor da área é: " + area);
        
    }
    
}
