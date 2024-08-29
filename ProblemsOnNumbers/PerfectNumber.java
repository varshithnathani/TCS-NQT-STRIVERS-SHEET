package ProblemsOnNumbers;

import java.util.Scanner;

/*
A perfect number is defined as a number that is the sum of its proper divisors ( all its positive divisors excluding itself).
 */
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        int n = SC.nextInt();
        int val = 0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                val += i;
            }
        }
        if(val == n){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
