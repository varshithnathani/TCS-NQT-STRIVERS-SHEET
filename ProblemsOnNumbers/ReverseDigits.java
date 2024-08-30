package ProblemsOnNumbers;

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        int n = SC.nextInt();
        int dummy = n;
        int val = 0;
        while(dummy > 0){
            int last = dummy%10;
            val = (val*10)+last;
            dummy/=10;
        }
        System.out.println(val);
    }
}
