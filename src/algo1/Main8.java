package algo1;

import java.util.Scanner;


public class Main8 {
    public static void main(String[] args) {
        //팰린드롬(특수문자를 무시하고 싶은 경우)
        Scanner in = new Scanner(System.in);
        String input = in.nextLine().toUpperCase().replaceAll("[^A-Z]", "");

        //이후는 회문비교 식으로 비교..
        String answer = "YES";

        String tmp = new StringBuilder(input).reverse().toString();
        if(!tmp.equals(input))  answer = "NO";

        System.out.println(answer);

    }

}
