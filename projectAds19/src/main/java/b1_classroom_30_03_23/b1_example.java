
package b1_classroom_30_03_23;

import java.util.Scanner;

public class b1_example {
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        System.out.print("X: ");
        int x = input.nextInt();
        
        System.out.print("Y: ");
        int y = input.nextInt();
        
        int quotient = x / y;
        int rest = x % y;
        
        System.out.println("O quociente da divisão é: " + quotient);
        System.out.println("O resto da divisão é: " + rest);
    
    
    }
}
