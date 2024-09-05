package ProblemsOnString;

import java.util.Scanner;

public class CountVowelsConsonetsSpace {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String str = new String(SC.nextLine());
        str = str.toLowerCase();
        System.out.println(str);
        solve(str);
    }
    public static void solve(String str){
        int vowelscount =0;
        int consonentcount = 0;
        int spacecount = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch =='i' || ch =='o' || ch =='u'){
                vowelscount++;
            }else if(ch >= 'a' && ch <= 'z'){
                consonentcount++;
            }else {
                spacecount++;
            }
        }
        System.out.println(vowelscount);
        System.out.println(consonentcount);
        System.out.println(spacecount);
    }
}
