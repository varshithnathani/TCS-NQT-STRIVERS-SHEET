package ArraysSheet;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner SC= new Scanner(System.in);
        int n = SC.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = SC.nextInt();
        }
        System.out.println(solve(n, arr));
    }
    public static int solve(int n, int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i =0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return  max;
    }
}
