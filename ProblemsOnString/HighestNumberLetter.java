package ProblemsOnString;

import java.util.Scanner;

public class HighestNumberLetter {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String str = SC.nextLine();
        solve(str.toLowerCase());
    }

    public static void solve(String str) {
        String[] words = str.split(" ");
        int max = 0;
        String newStr = "";
        for(int i=0; i<words.length; i++){
            String word = words[i];
            int[] freq = new int[26];
            for(int j =0; j<word.length(); j++){
                if(str.charAt(j)>= 'a' && str.charAt(j)<= 'z'){
                    freq[word.charAt(j)-'a']++;
                }
            }
            int temp = 0;
            for(int j=0; j<26; j++){
                if(freq[j]>1){
                    temp++;
                }
            }
            if(temp > max){
                max = temp;
                newStr = words[i];
            }
        }
        if(max == 0){
            System.out.println(-1);
        }else{
            System.out.println(newStr);
        }
    }
}
