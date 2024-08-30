package ProblemsOnNumbers;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        if(n<0){
            System.out.println("-ve");
        }else{
            System.out.println("+ve");
        }
    }
}
