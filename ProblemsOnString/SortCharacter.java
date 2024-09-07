package ProblemsOnString;

import java.util.Arrays;
import java.util.Scanner;

public class SortCharacter {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String str = SC.nextLine();
        solve(str);
    }
    public static void solve(String str){
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        System.out.println(new String(ch));
    }
}
