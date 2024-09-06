package ProblemsOnString;

import java.util.Scanner;

public class MaxOccuringChar {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String str = SC.nextLine();
        System.out.println(solve(str));
    }
    public static Character solve(String str){
        int[] freq = new int[256]; // ASCII --> 0-256
        int max = 0;
        char ch = 'a';
        for(int i=0; i<str.length(); i++){
            freq[str.charAt(i)]++;
            if(freq[str.charAt(i)]>max){
                max = freq[str.charAt(i)];
                ch = str.charAt(i);
            }
        }
        return ch;


    }
}
