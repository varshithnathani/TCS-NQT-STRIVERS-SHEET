package ProblemsOnString;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String str1 = SC.nextLine();
        String str2 = SC.nextLine();
        System.out.println(solve(str1,str2));
    }
    public static boolean solve(String str1, String str2){
        if(str1.length() != str2.length())
            return false;
        str1 = sortStr(str1);
        str2 = sortStr(str2);
        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i) !=  str2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static String sortStr(String str){
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        return new String(ch);

    }
}
