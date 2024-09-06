package ProblemsOnString;

import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String str1 = SC.nextLine();
        String str2 = SC.nextLine();
        solve(str1, str2);
    }
    public static void solve(String str1, String str2){
        boolean b;
        StringBuilder newStr = new StringBuilder();
        for(int i =0; i<str1.length(); i++){
            b = false;
            for(int j =0; j<str2.length(); j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    b = true;
                    break;
                }
            }
            if(b == false){
                newStr.append(str1.charAt(i));
            }
        }
        System.out.println(newStr.toString());

    }
}
