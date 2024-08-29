package ProblemsOnNumbers;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();

        int val = 0;
        int dummy = n;
        while(dummy >0){
            int last = dummy %10;
            val = (val* 10) + last;
            dummy /= 10;
        }
        if(val == n){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
