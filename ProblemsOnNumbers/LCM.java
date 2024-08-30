package ProblemsOnNumbers;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int m = SC.nextInt();
        int gcdval = gcd(n,m);
        int lcm = n*m /gcdval ;
        System.out.println(lcm);
    }
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
}
