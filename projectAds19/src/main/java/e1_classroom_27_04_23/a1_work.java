package e1_classroom_27_04_23;

import java.util.Scanner;

public class a1_work {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Dígite a distância em centímetros: ");
        int dist = input.nextInt();
        
        int distKm = dist / 100000;
        int restDistKm = dist % 100000;
        int distMm = restDistKm / 100;
        int restDistMm = restDistKm % 100;        
        int distCm = restDistMm;      
        System.out.println(distKm + "Km = " + distMm + "m = " + distCm + "cm");
     }
}
