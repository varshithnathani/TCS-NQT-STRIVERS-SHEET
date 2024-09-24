package CampusTraining;

import java.util.Scanner;
import java.util.Stack;

public class MoveBrackets {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int t = SC.nextInt();
        while(t-- > 0){
            int n = SC.nextInt();
            SC.nextLine();
            String str = SC.nextLine();

            Stack<Character> stack = new Stack<>();
            for(int i =0; i<n; i++){
                char ch = str.charAt(i);
                if(ch == '('){
                    stack.push('(');
                }else{
                    if(!stack.isEmpty() && stack.peek() == '('){
                        stack.pop();
                    }else{
                        stack.push(')');
                    }
                }

            }
            System.out.println(stack.size()/2);
        }
    }
}
