package ProblemsOnString;

import java.util.Scanner;

public class WordsInString {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String str = SC.nextLine();
        solve(str);
    }
    public static void solve(String str){
        String[] words = str.split(" ");
        System.out.println(words.length);

    }
}
