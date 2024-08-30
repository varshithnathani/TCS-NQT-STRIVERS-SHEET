package ProblemsOnNumbers;

import java.util.Scanner;

/*
When the sum of factorial of individual digits of a number is equal to the original number the number is called a strong number.  */
public class StrongNumber {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n  = SC.nextInt();
        int dummy = n;
        int sum =0;
        while(dummy >0){
            int last = dummy%10;
            sum += facto(last);
            dummy/=10;
        }
        if(sum == n){
            System.out.println("Yes");
        }else{
            System.out.println("NO");
        }
    }
    public static int facto(int n){
        if(n==0)
            return 1;
        return facto(n-1)*n;
    }
}
