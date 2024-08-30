package ProblemsOnNumbers;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        System.out.println(solve(n));
    }
    public static int solve(int n){
        if(n == 0)
            return 1;
        return solve(n-1)*n;
    }
}
