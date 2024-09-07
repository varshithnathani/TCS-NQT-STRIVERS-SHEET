package ProblemsOnString;

import java.util.Scanner;

public class StringIndex {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String str1 = SC.nextLine();
        String str2 = SC.nextLine();

        int indexval = str1.indexOf(str2);
        System.out.println(indexval);
    }
}
