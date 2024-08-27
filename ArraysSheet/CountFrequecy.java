package ArraysSheet;

import java.util.Scanner;

public class CountFrequecy {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = SC.nextInt();
        }
        solve(n, arr);
    }
    public static void solve(int n, int[] arr){
        boolean[] visit = new boolean[n];
        for(int i =0; i<n; i++){
            if(visit[i] == true){
                continue;
            }
            int count = 1;
            for(int j =i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    visit[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] +" "+ count);
        }
    }
}
