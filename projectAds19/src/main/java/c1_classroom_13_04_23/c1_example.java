package c1_classroom_13_04_23;

public class c1_example {
    public static void main(String args[]){
        
        int x = 5;
        int y = 7;
        
        if((x < 10) && (y < 10)){
            System.out.println("As duas condições são verdadeiras");
        }
        if((x < 10) && (y == 10)){
            System.out.println("Apenas a primeira condição é veradeira");
        }
        if((x > 10) && (y < 10)){
            System.out.println("Apenas a segunda opção é verdadeira");
        }
        if((x > 10) && (y > 10)){
            System.out.println("Apenas a segunda opção é verdadeira");
        }
    }
}
