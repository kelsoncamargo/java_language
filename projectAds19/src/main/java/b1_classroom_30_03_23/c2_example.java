
package b1_classroom_30_03_23;

import java.util.Scanner;

public class c2_example {
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Calculadora de consumo de combustível por KM");
        
        System.out.print("Digite a distância total em KM: ");
        double totalDistance = input.nextInt();
        
        System.out.print("Quantidade de combustível gasto: ");
        double spentFuel = input.nextDouble();
        
        double mediumConsum = totalDistance / spentFuel;
        System.out.print("O combustível gasto por KM foi: " + mediumConsum);
    
    }
}
