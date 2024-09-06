package ProblemsOnString;

import java.util.Scanner;

public class LexicographicAlphabet {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String str = SC.nextLine();
        solve(str);
    }
    public static void solve(String str){
        StringBuilder newStr = new StringBuilder();
        for(int i =0 ; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                if(ch == 'z'){
                    newStr.append('a');
                }else {
                    newStr.append((char) +(ch + 1));
                }
            }
            else if(ch >= 'A' && ch <= 'Z'){
                if(ch == 'Z'){
                    newStr.append('A');
                }else{
                    newStr.append((char) +(ch + 1));
                }
            }
            else{
                newStr.append(ch);
            }
        }
        System.out.println(newStr);
    }
}
