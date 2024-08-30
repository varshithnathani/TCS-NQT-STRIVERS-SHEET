package ProblemsOnNumbers;

import java.util.Scanner;

public class Replace0With1 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();

        String str = Integer.toString(n);
        String str2 ="";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '0'){
                str2+= '1';
            }else{
                str2+= ch;
            }
        }

        int m = Integer.parseInt(str2);
        System.out.println(m);
    }
}
