package ArraysSheet;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = SC.nextInt();
        }
        for(int k: arr){
            System.out.print(k+" ");
        }
        System.out.println();
        solve(n, arr);
        for(int k: arr){
            System.out.print(k+" ");
        }

    }
    public static void solve(int n, int[] arr){
        int start = 0;
        int end = n-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
