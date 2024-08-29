package ProblemsOnNumbers;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();

        brute(n);
        Optimal(n);
    }
    public static void brute(int n){
        int count = 0;
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                count++;
            }
            if(count > 2){
                System.out.println("Not Prime");
                break;
            }

        }
        if(count == 2){
            System.out.println("Prime");
        }
    }

    public static void Optimal(int n) {
        if (n <= 1) {
            System.out.println("Not Prime");
            return;
        }
        if (n == 2) {
            System.out.println("Prime");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                // If n is divisible by i, then it's not a prime
                isPrime = false;
                break; // No need to check further if a divisor is found
            }
        }
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

}

