package algo5_stackqueue;

import java.util.Scanner;
import java.util.Stack;

//4. 후위식 연산
//설명
//후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
//만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.

//입력
//첫 줄에 후위연산식이 주어집니다. 연산식의 길이는 50을 넘지 않습니다.
//식은 1~9의 숫자와 +, -, *, / 연산자로만 이루어진다.

//출력
//연산한 결과를 출력합니다.

//예시 입력 1
//352+*9-
//예시 출력 1
//12

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Stack<Integer> stack = new Stack<>();

        for (char a : str.toCharArray()) {
            if(Character.isDigit(a)) stack.push(Character.getNumericValue(a));
            else{
                int rt = stack.pop();
                int lf = stack.pop();
                if(a == '+') stack.push(lf+rt);
                if(a == '-') stack.push(lf-rt);
                if(a == '*') stack.push(lf*rt);
                if(a == '/') stack.push(lf/rt);
            }
        }
        System.out.println(stack.peek());

    }
}
