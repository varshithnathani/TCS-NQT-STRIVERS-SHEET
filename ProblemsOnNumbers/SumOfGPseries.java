package ProblemsOnNumbers;

import java.util.Scanner;

public class SumOfGPseries {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        double a = SC.nextDouble(); // first term
        double r = SC.nextDouble(); // common ratio
        double n = SC.nextDouble(); // no of terms

        // using for loop
        double sum = 0;
        double countnext = a;
        for(int i=1; i<=n; i++){
            sum += countnext;
            countnext = a* (Math.pow(r,i));
        }
        System.out.println(sum);
    }
}
