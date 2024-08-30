package ProblemsOnNumbers;

import java.util.Scanner;

/*
A number is called an Automorphic number if and only if its square ends in the same digits as the number itself.
 */
public class AutoMorphicNumber {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();

        int val = n * n;
        boolean b = true;
        while(n>0){
            if(n%10 != val%10) {
                b = false;
                break;
            }
            n/=10;
            val/=10;
        }
        if(b){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
