package ProblemsOnString;

import java.util.Scanner;

public class CapitalFirstLast {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String str = SC.nextLine();
        solve(str);
    }
    public static void solve(String str){
        String[] word =  str.split(" ");
        for(int i =0; i< word.length; i++){

            if(word[i].length()>1){
                word[i]= Character.toUpperCase(word[i].charAt(0)) +
                        word[i].substring(1, word[i].length() - 1) +
                        Character.toUpperCase(word[i].charAt(word[i].length()-1));
            }else{
                word[i] = word[i].toUpperCase();
            }
        }
        StringBuilder newStr = new StringBuilder();
        for(int i=0; i< word.length; i++){
            newStr.append(word[i]+" ");
        }
        System.out.println(newStr);
    }
}
