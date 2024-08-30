package ProblemsOnNumbers;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();

        if(n==0){
            System.out.println(0);
        }else{
            int fibo[] = new int[n+1];
            fibo[0] = 0;
            fibo[1] = 1;
            for(int i=2; i<=n; i++){
                fibo[i] = fibo[i-1]+fibo[i-2];
            }

            for(int a : fibo){
                System.out.println(a);
            }
        }

    }

}
