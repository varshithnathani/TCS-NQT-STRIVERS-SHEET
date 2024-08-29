package Sortings;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++ ){
            arr[i] = SC.nextInt();
        }
        solve(n,arr);
        for(int num: arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    public static void solve(int n, int[] arr){
        for(int i=1; i<n; i++){
            int j = i-1;
            int key = arr[i];
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
