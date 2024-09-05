package ProblemsOnString;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String str = SC.nextLine();
        System.out.println(solve(str));
        System.out.println(solve2(str));
    }
    public static String solve(String str){

        StringBuilder newStr = new StringBuilder(str);
        newStr.reverse();
        str = newStr.toString();
        return str;

    }
    public static String solve2(String str){
        // using for loop
        String newStr = "";
        for(int i=str.length()-1; i>=0; i--){
            newStr+=str.charAt(i);
        }
        return newStr;
    }
}
