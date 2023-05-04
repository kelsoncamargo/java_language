package d1_classroom_20_04_23;

import java.util.Scanner;

public class b1_exercise {
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Banco de sangue");
        System.out.println("Informe sua idade");
        int ageUser = input.nextInt();
        
        if(ageUser >= 18 && ageUser <= 67){
            System.out.println("Você pode doar sangue");
        }else{
            System.out.println("Você não pode doar sangue");
        }
    }
}
