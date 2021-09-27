package algo1;

import java.util.Scanner;

//3.문장 속 단어
public class Main3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        String answer = "";


        int maxlength = Integer.MIN_VALUE, pos;

        String[] s = input.split(" ");
        for (String word : s) {
            if(answer.length() < word.length())
                answer = word;

        }

        while((pos = input.indexOf(" ")) != -1){
            String comp = input.substring(0, pos);
            if(maxlength < comp.length()){
                answer = comp;
            }
            input = input.substring(pos+1);
        }
        if(answer.length() < input.length()) answer = input;

        System.out.println(answer);

    }
}
