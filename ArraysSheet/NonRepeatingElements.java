package ArraysSheet;

import java.util.Arrays;
import java.util.Scanner;

public class NonRepeatingElements {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = SC.nextInt();
        }
        solve(n, arr);
    }
    public static void solve(int n, int[] arr){
        boolean[] visit = new boolean[n];
        for(int i=0; i<n; i++){
            visit[i] = true;
        }
        for(int i=0; i<n; i++){
                        for(int j = i+1; j<n; j++){
                            if(arr[i] == arr[j]){
                                visit[j]= false;
                                visit[i] = false;
                            }
            }
        }
        for(int i=0; i<n; i++){
            if(visit[i] == true){
                System.out.print(arr[i] +" ");
            }

        }
        System.out.println();
    }

}
