package ProblemsOnNumbers;

import java.util.Scanner;

public class PermutationSeatOccupy {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int m = SC.nextInt();
        int val = fact(n) / fact(n-m);
        System.out.println(val);

    }
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        if(n == 1)
            return 1;
        return fact(n-1)*n;
    }
}
