package ProblemsOnNumbers;

import java.util.Scanner;

/*
An Amrstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.
 */
public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();

        int len = String.valueOf(n).length();
        int dummy = n;
        int val = 0;
        while(dummy >0){
            int last = dummy %10;
            val += Math.pow(last, len);
            dummy/=10;
        }
        if(val == n){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
