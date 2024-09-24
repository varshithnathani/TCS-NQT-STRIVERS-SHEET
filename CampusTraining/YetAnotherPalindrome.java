package CampusTraining;

import java.util.Scanner;

public class YetAnotherPalindrome {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int t = SC.nextInt();

        while (t-- > 0) {
            int n = SC.nextInt();

            if (n < 3) {
                System.out.println("false");
            } else {
                boolean isPalindrome = true;
                int[] arr = new int[n];

                for (int i = 0; i < n; i++) {
                    arr[i] = SC.nextInt();
                }

                for (int i = 0; i < arr.length / 2; i++) {
                    if (arr[i] != arr[arr.length - i - 1]) {
                        isPalindrome = false;
                        break;
                    }
                }
                System.out.println(isPalindrome);
            }
        }
    }
}
