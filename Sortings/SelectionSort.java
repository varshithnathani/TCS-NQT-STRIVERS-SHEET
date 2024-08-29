package Sortings;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = SC.nextInt();
        }
        solve(n,arr);
        for(int num: arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    public static void solve(int n, int[] arr){
        for(int i =0; i<n; i++){
            int min = i;
            for(int j =i+1; j<n; j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            // swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
