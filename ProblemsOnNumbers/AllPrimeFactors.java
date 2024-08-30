package ProblemsOnNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AllPrimeFactors {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n= SC.nextInt();

        // factors
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =1; i<= Math.sqrt(n); i++){
            if(n%i == 0){
                if(n/i != i){
                    list.add(i);
                    list.add(n/i);
                }
                if(n/i == i){
                    list.add(i);
                }
            }
        }

        // prime factors

        for(int i =1; i<list.size(); i++){
            int test = list.get(i);
            int count =0;
            for(int j=1; j<=test; j++){
                if(test%j == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.println(test);
            }
        }
    }
}
