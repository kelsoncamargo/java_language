
package b1_classroom_30_03_23;

import java.util.Scanner;

public class c1_exercise {
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Calculo da Média");
        
        System.out.print("Digite a primeira nota do anulo: ");
        double note1 = input.nextDouble();
        
        System.out.print("Digite a segunda nota do anulo: ");
        double note2 = input.nextDouble();
        
        System.out.print("Digite a terceira nota do anulo: ");
        double note3 = input.nextDouble();
        
        double average = (note1 + note2 + note3) / 3;
        System.out.println("A média deste aluno é? " + average);
           
    }
}
