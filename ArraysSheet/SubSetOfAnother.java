package ArraysSheet;

import java.util.HashSet;
import java.util.Scanner;


public class SubSetOfAnother {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {1,2,3,4,5,6,7,8};
        System.out.println(solve(arr1,arr2));
    }
    public static boolean solve(int[] arr1,int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr2.length; i++){
            set.add(arr2[i]);
        }
        for(int i=0; i<arr1.length; i++){
            if(!set.contains(arr1[i])){
                return false;
            }
        }
        return true;
    }
}
