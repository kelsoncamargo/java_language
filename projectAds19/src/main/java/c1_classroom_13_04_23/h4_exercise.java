
package c1_classroom_13_04_23;

import java.util.Scanner;

public class h4_exercise {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro menor que 1000: ");
        int  x = input.nextInt();
        
        int centenas = x / 100;
        int dezenas = (x % 100) / 10;
        int unidades = (x % 100) % 10;
        
        System.out.print("O número: " + x + " possui " + centenas + " dezenas, " + dezenas + " centenas e " + unidades + " unidades" );
        
        
    }   
}
