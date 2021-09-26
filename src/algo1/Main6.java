package algo1;

import java.util.Scanner;


public class Main6 {
    public static void main(String[] args) {
        //중복문자 제거
        Scanner in = new Scanner(System.in);
        String input = in.next();

        String answer = "";
        for(int i=0; i<input.length(); i++){
            if(input.indexOf(input.charAt(i)) == i){
                answer+=input.charAt(i);
            }
        }

        System.out.println(answer);

    }
}
