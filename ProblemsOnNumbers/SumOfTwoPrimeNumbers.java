package ProblemsOnNumbers;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfTwoPrimeNumbers {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();

        solve(n);
    }
    public static void solve(int n){
        boolean b = false;
        for(int i =2; i<n/2; i++){
            if(isPrime(i)){
                if(isPrime(n-i)){  // n = i+ n-i
                    //System.out.println(i+" + "+(n-i )+" = "+ n);
                    b = true;
                    break;
                }
            }
        }
        if(b == false){
            System.out.println(false);
        }else{
            System.out.println(true);
        }
    }
    public static boolean isPrime(int num){
        boolean ck = true;
        if(num <= 1)
            return false;
        if(num == 2)
            return true;
        for(int i =2; i<=num/2; i++){
            if(num%i == 0){
                ck = false;
                break;
            }

        }
        if(ck == true){
            return true;
        }else{
            return false;
        }
    }
}
