package ProblemsOnNumbers;

import java.util.Scanner;
/*
3+7+8=18. 378 is divisible by 18. Therefore 378 is a harshad number.

 */
public class Harshad {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();

        int dummy = n;
        int sum =0;
        while(dummy > 0){
            int last = dummy %10;
            sum += last;
            dummy/= 10;
        }
        if(n % sum == 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
