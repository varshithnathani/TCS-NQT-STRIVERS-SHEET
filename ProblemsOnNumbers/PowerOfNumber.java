package ProblemsOnNumbers;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner SC =new Scanner(System.in);
        int n = SC.nextInt();
        int x = SC.nextInt();
        int val = 1;
        for(int i=0; i<x;i++){
            val*= n;
        }
        System.out.println(val);
    }
}
