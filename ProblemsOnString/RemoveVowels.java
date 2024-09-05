package ProblemsOnString;

import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String str = SC.nextLine();
        System.out.println(solve(str));
    }
    public static String solve(String str){
        String newStr = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                continue;
            }else{
                newStr+=ch;
            }
        }
        return newStr;
    }
}
