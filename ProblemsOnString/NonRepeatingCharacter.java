package ProblemsOnString;

import java.util.Scanner;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String str = SC.nextLine();
        solve(str);
    }
    public static void solve(String str){
        for(int i=0; i<str.length(); i++){
            boolean b = true;
            for(int j =0; j<str.length(); j++){
                if(i!= j && str.charAt(i)== str.charAt(j)){
                    b = false;
                    break;
                }
            }
            if(b==true){
                System.out.println(str.charAt(i));
            }
        }
    }
}
