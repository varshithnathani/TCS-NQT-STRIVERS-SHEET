package ProblemsOnNumbers;

import java.util.Scanner;

public class SumOfAPSeries {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        double n = SC.nextInt();
        double a = SC.nextInt();
        double d = SC.nextInt();

        double sum =( n/2 )* ( 2*a + (n-1) *d);
        System.out.println(sum);

        // using for loop
        double sum2 = 0;
        double countnext = a;
        for(int i =1; i<=n; i++){
            sum2+= countnext;
            countnext  += d;
        }
        System.out.println(sum2);
    }
}
