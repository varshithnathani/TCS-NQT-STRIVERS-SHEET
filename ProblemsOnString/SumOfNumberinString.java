package ProblemsOnString;

import java.util.Scanner;

public class SumOfNumberinString {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String str = SC.nextLine();
        System.out.println(solve(str));
    }
    public static int solve(String str){
        int sum =0;
        String tempsum = "0";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                tempsum+=ch;
            }else{
                sum += Integer.parseInt(tempsum);
                tempsum="0";
            }

        }
        return sum;
    }
}
