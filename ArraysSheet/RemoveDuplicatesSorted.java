package ArraysSheet;

import java.util.Scanner;

public class RemoveDuplicatesSorted {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = SC.nextInt();
        }
        int res = solve(n, arr);
        for(int i =0; i<res; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int  solve(int n, int[] arr){
        int i =0;
        for(int j =0; j<n; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
}
