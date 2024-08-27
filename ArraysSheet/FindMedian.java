package ArraysSheet;

import java.util.Arrays;
import java.util.Scanner;

public class FindMedian {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n= SC.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = SC.nextInt();
        }
        System.out.println(solve(n, arr));
    }
    public static double solve(int n, int[] arr){
        Arrays.sort(arr);
        if(n%2 != 0){
            return arr[n/2];
        }
        int mid1= arr[(n/2)-1];
        int mid2 = arr[n/2];
        double val = (double)(mid1+mid2)/2;
        return val;
    }
}
