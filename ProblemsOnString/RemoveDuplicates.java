package ProblemsOnString;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String str = SC.nextLine();
        solve(str);
        solve2(str);
    }
//    public static void solve(String str){
//        int[] freq = new int[256];
//        for(int i=0; i<str.length(); i++){
//            freq[str.charAt(i)]++;
//        }
//        String newStr = "";
//        for(int i =0; i<256; i++){
//            if(freq[i]!=0){
//                newStr+=(char) i;
//            }
//        }
//        System.out.println(newStr);
//    }

    public static void solve(String str){
        String newStr = "";
        for(int i=0; i<str.length(); i++){
            int j;
            for(j =0; j<i; j++){
                if(str.charAt(i) == str.charAt(j)){
                    break;
                }
            }
            if(i == j){
                newStr+=str.charAt(i);
            }
        }
        System.out.println(newStr);
    }

    public static void solve2(String str){
        boolean[] b = new boolean[26];
        String newStr = "";
        for(int i =0; i<str.length(); i++){
            if(b[str.charAt(i)-'a']==false){
                newStr+=str.charAt(i);
                b[str.charAt(i)-'a']=true;
            }
        }
        System.out.println(newStr);
    }
}
