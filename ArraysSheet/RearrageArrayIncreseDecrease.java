package ArraysSheet;

import java.util.Arrays;
import java.util.Scanner;

public class RearrageArrayIncreseDecrease {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = SC.nextInt();
        }
        Solve(n, arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Solve(int n, int[] arr){
        Arrays.sort(arr);
        int mid = n/2;
        int end = n-1;
        while(mid<end){
            int temp = arr[mid];
            arr[mid] = arr[end];
            arr[end] = temp;
            mid++;
            end--;
        }
    }
}
