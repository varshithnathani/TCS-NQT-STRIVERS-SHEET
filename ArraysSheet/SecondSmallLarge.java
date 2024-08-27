package ArraysSheet;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallLarge {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n= SC.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = SC.nextInt();
        }
        ArrayList<Integer> list = solve(n, arr);
        for(int k: list){
            System.out.print(k+" ");
        }
        System.out.println();
    }
    public static ArrayList<Integer> solve(int n, int[] arr){
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        for(int i =0; i<n; i++){
            if(arr[i] < small){
                small = arr[i];
            }
            if(arr[i] > large) {
                large = arr[i];
            }
        }
        for(int i =0; i<n; i++){
            if(arr[i] < secondSmall && arr[i] != small){
                secondSmall = arr[i];
            }
            if(arr[i] > secondLarge && arr[i] != large){
                secondLarge = arr[i];
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(secondLarge);
        list.add(secondSmall);
        return  list;
    }
}
