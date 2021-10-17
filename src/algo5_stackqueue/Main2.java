package algo5_stackqueue;


import java.util.Scanner;
import java.util.Stack;

//2. 괄호문자 제거
//입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.
//예시 입력 1
//(A(BC)D)EF(G(H)(IJ)K)LM(N)
//예시 출력 1
//EFLM

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        Stack<Character> stack = new Stack<>();
        for(char i : str.toCharArray()){
            if(i != ')')
            stack.push(i);
            else{
                while(stack.peek() != '('){
                    stack.pop();
                }
                stack.pop();
            }
        }
        String ans = "";
        for(int i=0; i<stack.size(); i++){
            ans+=stack.get(i);
        }
        System.out.println(ans);
    }
}
