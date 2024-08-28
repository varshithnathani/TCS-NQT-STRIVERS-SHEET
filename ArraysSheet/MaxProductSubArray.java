package ArraysSheet;

import java.util.Scanner;

public class MaxProductSubArray {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = SC.nextInt();
        }
        solve(n,arr);
    }
    public static void solve(int n,int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            for(int j =i; j<n; j++){
                int val = 1;
                for(int k=i; k<=j; k++){
                    val *= arr[k];
                }
                max = Math.max(max, val);
            }
        }
        System.out.println(max);
    }
}
