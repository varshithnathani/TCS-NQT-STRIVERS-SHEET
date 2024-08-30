package ProblemsOnNumbers;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        System.out.println(solve(n));
    }
    public static boolean solve(int n){
        if(n % 400 == 0)
                return true;
        if(n% 4 == 0)
            return  true;
        if(n% 100 == 0)
            return false;
        return false;
    }
}
