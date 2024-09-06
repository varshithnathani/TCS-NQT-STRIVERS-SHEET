package ProblemsOnString;

import java.util.Scanner;

public class CaliculateFrequency {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String str = SC.nextLine();
        solve(str);
    }
    public static void solve(String str){
        int[] freq = new int[26];
        for(int i=0; i<str.length(); i++){
            freq[str.charAt(i)-'a']++;
        }
        for(int i=0; i<26; i++){
            if(freq[i] != 0){
                System.out.print((char)(i+'a'));
                System.out.print(freq[i]+" ");
            }
        }
    }
}
