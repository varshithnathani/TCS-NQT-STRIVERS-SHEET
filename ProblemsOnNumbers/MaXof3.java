package ProblemsOnNumbers;

import java.util.Scanner;

public class MaXof3 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int m = SC.nextInt();
        int l = SC.nextInt();

        System.out.println(Math.max(n,Math.max(m,l)));
    }
}
