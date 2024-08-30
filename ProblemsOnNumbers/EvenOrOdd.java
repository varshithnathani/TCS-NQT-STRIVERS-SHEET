package ProblemsOnNumbers;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        if(n%2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
