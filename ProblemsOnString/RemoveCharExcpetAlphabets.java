package ProblemsOnString;

import java.util.Scanner;

public class RemoveCharExcpetAlphabets {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String str = SC.nextLine();
        System.out.println(solve(str));
    }
    public static String solve(String str){
        String newStr = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <='z' || ch >= 'A' && ch <='Z'){
                newStr+=ch;
            }else{
                continue;
            }
        }
        return  newStr;
    }
}
