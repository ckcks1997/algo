package algo1;

import java.util.Scanner;


public class Main7 {
    public static void main(String[] args) {
        //회문문자열?
        Scanner in = new Scanner(System.in);
        String input = in.next().toUpperCase();

        String answer = "YES";

        //1.직접비교
//        char[] chars = input.toCharArray();
//
//        int start=0, end=input.length()-1;
//        while(start<end){
//            if(chars[start] != chars[end]){
//                answer = "NO";
//                break;
//            }
//            start++;
//            end--;
//        }

        //2.StringBuilder이용
        String tmp = new StringBuilder(input).reverse().toString();
        if(!tmp.equals(input))
            answer = "NO";

        System.out.println(answer);



    }
}
