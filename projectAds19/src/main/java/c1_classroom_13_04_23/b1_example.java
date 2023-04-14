package c1_classroom_13_04_23;

import java.util.Scanner;

public class b1_example {
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        System.out.print("Nota 1: ");
        double note1 = input.nextDouble();
        System.out.print("Nota 2: ");
        double note2 = input.nextDouble();
        
        double average = (note1 + note2)/2;
        
        if(average > 7){
            System.out.println("APROVADO");
        }
        else{
            System.out.println("REPROVADO");
        }
        
    }
}
