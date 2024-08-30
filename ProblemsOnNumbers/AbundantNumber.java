package ProblemsOnNumbers;

import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int  n = SC.nextInt();
        int sum = 0;
        for(int i =1; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                if(n/i == i){
                    sum+= i;
                }
                else{
                    sum+= i;
                    sum+= n/i;
                }
            }
        }
        sum -= n;
        if(sum > n){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
