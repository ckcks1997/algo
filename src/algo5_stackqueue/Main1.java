package algo5_stackqueue;


import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

//1. 올바른 괄호
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        Stack<Character> stack = new Stack<>();
        for(char i : str.toCharArray()){
            if(i == '(')
                stack.push('(');
            else if(i == ')'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
                else{
                    System.out.println("NO");
                    return;
                }
            }
        }
        if(stack.isEmpty()) System.out.println("YES");
        else System.out.println("NO");
    }
}
