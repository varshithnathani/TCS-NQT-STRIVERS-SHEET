package ArraysSheet;

import java.util.Arrays;
import java.util.Scanner;

public class RepeatingElements {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n= SC.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = SC.nextInt();
        }
        int[] arr2 =solve(n, arr);
        for(int num: arr2){
            if(num != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        int[] arr3 =solve2(n, arr);
        for(int num: arr3){
            if(num != 0) {
                System.out.print(num + " ");
            }
        }

    }
    public static int[] solve(int n, int[] arr){
        int count =0;
        int[] dummy = new int[n];
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    dummy[count] = arr[i];
                    count++;
                }
            }
        }
        return dummy;
    }

    public static int[] solve2(int n, int[] arr){
        Arrays.sort(arr);
        int count = 0;
        int[] dummy = new int[n];
        for(int i=0; i<n-1 ; i++){
            if(arr[i] == arr[i+1]){
                dummy[count] = arr[i];
                count++;
            }
        }
        return dummy;
    }
}
