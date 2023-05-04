package d1_classroom_20_04_23;

import java.util.Scanner;

public class c1_exercise {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Direitos");
        System.out.println("Informe sua idade: ");
        int ageUser = input.nextInt();
        
        if(ageUser < 16){
            System.out.println("Não pode votar nem dirigir");
        } else{
            if(ageUser >= 16 && ageUser < 18){
                System.out.println("Você pode votar, mas não pode dirigir");
            }else{
                System.out.println("Pode votar e dirigir!");
            }
        } 
    }
}
