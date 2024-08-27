package ArraysSheet;

import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = SC.nextInt();
        }
        int result =solve(n, arr);
        System.out.println(result);
    }
    public static int solve(int n, int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i =0; i<n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
