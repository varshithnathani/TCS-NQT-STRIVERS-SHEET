package CampusTraining;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
//        int n = SC.nextInt();
//        int[] arr = new int[n];
//        for(int i =0; i<n; i++){
//            arr[i] = SC.nextInt();
//
//        }
        int[] arr = {12,-3,15,172,-1};
        solve(arr);
    }
    public static void solve(int[] arr){
        int maxSum =0;
        for(int i =0; i<arr.length-1; i++){
            if(arr[i] < 0){
                if(Math.abs(arr[i]) > arr[i+1] || arr[i+1]<0){
                    arr[i] = -arr[i];
                    arr[i+1] = - arr[i+1];
                }

            }
            maxSum+=arr[i];
        }
        System.out.println(maxSum);
    }
}
