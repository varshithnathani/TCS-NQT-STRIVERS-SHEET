package ProblemsOnNumbers;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int m = SC.nextInt();
        System.out.println(solve(n,m));
    }
    public static int solve(int n, int m){
        if(m == 0){
            return n;
        }
        return solve(m, n%m);
    }
}
