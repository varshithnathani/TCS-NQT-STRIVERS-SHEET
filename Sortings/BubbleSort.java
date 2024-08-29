package Sortings;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = SC.nextInt();
        }
        Sort(n, arr);
        for(int num: arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    public static void Sort(int n, int[] arr){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp  = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
}
