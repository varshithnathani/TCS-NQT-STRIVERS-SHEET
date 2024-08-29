package ProblemsOnNumbers;

import java.util.Scanner;

public class AllPalindromesInRange {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int min = SC.nextInt();
        int max = SC.nextInt();


        for(int i= min; i<max; i++){
            int dummy = i;
            int val = 0;
            while(dummy>0){
                int last = dummy%10;
                val = (val*10) + last;
                dummy /= 10;
            }
            if(val == i){
                System.out.println(i+" ");
            }
        }
    }
}
