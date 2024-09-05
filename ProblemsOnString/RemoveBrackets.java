package ProblemsOnString;

import java.util.Scanner;

public class RemoveBrackets {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String str = SC.nextLine();
        //System.out.println(solve(str));
        System.out.println(solve2(str));
    }
    public static String solve(String str){
        String newStr = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == ')'){
                continue;
            }else{
                newStr+= ch;
            }
        }
        return newStr;
    }

    public static String solve2(String str){
        StringBuilder newStr = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '(' || str.charAt(i) == ')'){
                continue;
            }else{
                newStr.append(str.charAt(i));
            }
        }
        str = newStr.toString();
        return str;
    }

}
