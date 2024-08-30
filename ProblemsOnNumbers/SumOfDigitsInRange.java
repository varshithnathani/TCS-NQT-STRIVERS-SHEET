package ProblemsOnNumbers;

import java.util.Scanner;

public class SumOfDigitsInRange {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int m = SC.nextInt();
        int sum  =0;
        for(int i=n; i<=m; i++){
            sum+= i;
        }
        System.out.println(sum);
    }
}
