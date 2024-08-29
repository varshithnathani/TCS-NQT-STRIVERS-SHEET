package ProblemsOnNumbers;

import java.util.Scanner;

public class AllPrimeInRange {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int min = SC.nextInt();
        int max = SC.nextInt();

        for(int i=min; i<= max; i++){

            int n = i;
            if(n<=1){
                System.out.println("Not Prime "+ n);
                continue;
            }
            if(n == 2){
                System.out.println("Prime "+ n);
                continue;
            }
            boolean isPrime = true;
            for(int j=2; j<Math.sqrt(n); j++){
                if(n%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println("Prime "+n);
            }else{
                System.out.println("Not Prime "+ n);
            }
        }
    }
}
