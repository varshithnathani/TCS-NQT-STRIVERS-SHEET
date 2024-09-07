package ProblemsOnString;

import java.util.Scanner;

public class ConcatString {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        char[] ch1 = {'H','E','L','L','O'};
        char[] ch2 = {'J','A','V','A'};
        String str1 = "Hello";
        String str2 = "Java";

        StringBuilder newStr1 = new StringBuilder();
        for(int i =0; i<ch1.length; i++){
            newStr1.append(ch1[i]);
        }
        for(int i =0; i<ch2.length; i++){
            newStr1.append(ch2[i]);
        }
        System.out.println(newStr1.toString());

        StringBuilder newStr2 =  new StringBuilder();
        newStr2.append(str1);
        newStr2.append(str2);
        System.out.println(newStr1.toString());
    }
}
