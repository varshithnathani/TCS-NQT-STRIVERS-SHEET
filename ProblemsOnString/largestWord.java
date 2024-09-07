package ProblemsOnString;

import java.util.Scanner;

public class largestWord {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String str = SC.nextLine();
        solve(str);
    }
    public static void solve(String str){
        String[] word = str.split(" ");
        String newStr = "";
        for(int i=0; i<word.length; i++){
            if(newStr.length() < word[i].length()){
                newStr = word[i];
            }
        }
        System.out.println(newStr);
    }
}
