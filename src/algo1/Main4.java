package algo1;

import java.util.ArrayList;
import java.util.Scanner;


public class Main4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //몇개가 입력되는지
        int n = in.nextInt();
        String[] input = new String[n];
        //문자열 입력력
       for(int i=0; i<n; i++){
            input[i] = in.next();
        }

        //1.StringBuilder의 reverse 사용법
        ArrayList<String> answer = new ArrayList<>();
//        for(String x : input){
//            String tmp = new StringBuilder(x).reverse().toString();
//            answer.add(tmp);
//        }

        //2. 직접 뒤집기
        for(String x : input){
            char[] s = x.toCharArray();
            for(int i=0; i<s.length /2; i++){
                char temp;
                temp = s[i];
                s[i] = s[s.length - i -1];
                s[s.length -i -1] = temp;
            }
            answer.add(String.valueOf(s));
        }

        //출력
        for (String s : answer) {
            System.out.println(s);
        }
    }
}
