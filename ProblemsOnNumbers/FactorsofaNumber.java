package ProblemsOnNumbers;

import java.util.Scanner;

public class FactorsofaNumber {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();

        for(int i=1; i<=n; i++){
            if(n%i == 0){
                System.out.print(i+ " ");
            }
        }
        System.out.println();

        for(int i=1; i<=Math.sqrt(n); i++){
            if(n % i ==0) {
                if(n/i == i){
                    System.out.print(i+" ");
                }
                if(n/i != i){
                    System.out.print(i+" "+n/i+" ");
                }
            }
        }
    }
}
