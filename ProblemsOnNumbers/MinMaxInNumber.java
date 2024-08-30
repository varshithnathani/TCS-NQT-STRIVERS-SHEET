package ProblemsOnNumbers;

import java.util.Scanner;

public class MinMaxInNumber {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;

        int dummy =n;
        while(dummy>0){
            int last = dummy%10;
            if(small > last){
                small = last;
            }
            if(large < last){
                large = last;
            }
            dummy /=10;
        }
        System.out.println("Small: "+ small +" Large: "+ large);

    }
}
