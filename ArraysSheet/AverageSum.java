package ArraysSheet;

import java.util.Scanner;

public class AverageSum {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = SC.nextInt();
        }
        System.out.println(solve(n,arr));
    }
    public static double solve(int n, int[] arr){
        int sum = 0;
        for(int i=0; i<n; i++){
            sum+= arr[i];
        }
        return (double)sum/n;
    }
}
