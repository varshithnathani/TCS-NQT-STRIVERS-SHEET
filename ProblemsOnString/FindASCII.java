package ProblemsOnString;

import java.util.Scanner;

public class FindASCII {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("please enter only 1 character");
        String str = SC.next();
        if(str.length() == 1){
            System.out.println(solve(str));
        }else{
            System.out.println("please enter only 1 char");
        }
    }
    public static int solve(String str){
        char ch = str.charAt(0);
        int n = (int) ch;
        return n;
    }
}
