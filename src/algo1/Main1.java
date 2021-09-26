package algo1;

import java.util.Scanner;

//1.문자찾기
public class Main1 {

    public static int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        for (int a=0; a<str.length(); a++) {
            if(str.charAt(a) == t) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input1 = in.nextLine();
        char input2 = in.nextLine().charAt(0);
        int solution1 = solution(input1, input2);
        System.out.println(solution1);
        return ;
    }
}
