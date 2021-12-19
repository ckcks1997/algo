package algo5_stackqueue;

import java.util.Scanner;
import java.util.Stack;

//5. 쇠막대기

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Stack<Character> stack = new Stack<Character>();
        int  count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '(' && str.charAt(i+1) == ')'){
                count+=stack.size();
                i++;
            }
            else if(str.charAt(i) == '('){
                count++;
                stack.push('(');
            }else{
                stack.pop();
            }
        }
        System.out.println("count = " + count);
    }
}
