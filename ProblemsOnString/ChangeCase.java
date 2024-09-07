package ProblemsOnString;

import java.util.Scanner;

public class ChangeCase {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String str = SC.nextLine();
        solve(str);
    }
    public static void solve(String str){
        StringBuilder newStr = new StringBuilder();
        char[] ch = str.toCharArray();
        for(int i =0; i<ch.length; i++){
            char item = ch[i];
            if(Character.isLowerCase(item)){
                newStr.append(Character.toUpperCase(item));
            }else if(Character.isUpperCase(item)){
                newStr.append(Character.toLowerCase(item));
            }else{
                continue;
            }
        }
        System.out.println(newStr.toString());
    }
}
