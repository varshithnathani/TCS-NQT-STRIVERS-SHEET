package ProblemsOnString;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String str = SC.nextLine();
        str = str.toLowerCase();
        boolean b = true;
        for(int i =0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                b = false;
                break;
            }
        }
        System.out.println(b);

    }
}
