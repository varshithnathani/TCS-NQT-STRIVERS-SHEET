package ProblemsOnNumbers;

import java.util.Scanner;

public class AddTwoFractions {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int num1 = SC.nextInt();
        int den1 = SC.nextInt();
        int num2 = SC.nextInt();
        int den2 = SC.nextInt();

        display(num1,den1);
        display(num2,den2);

        int commondenomenator = den1* den2;

        // new numerator
        int newnum1 = num1 * den2;
        int newnum2 = num2 * den1;
        int newnum = newnum1+newnum2;

        int gcdval = gcd(newnum, commondenomenator);

        newnum /= gcdval;
        commondenomenator /= gcdval;

        System.out.println("New Fraction: " );
        display(newnum,commondenomenator);
    }
    public static void display(int num, int den){
        System.out.println("fraction : "+num +"/"+ den);
    }
    public static int gcd(int den1, int den2){
        if(den2 == 0)
            return den1;
        return gcd(den2,den1%den2);
    }
}
