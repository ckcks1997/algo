package baekjoon;

import java.util.Scanner;


public class S1_word_1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputVal = scanner.nextLine();

        int[] alphabet = new int[26];

        inputVal=inputVal.toUpperCase();
        for (char c : inputVal.toCharArray()) {
            alphabet[c-'A']++;
        }

        int max = -1;
        char ch = '?';
        for (int i = 0; i < alphabet.length; i++) {
            if(alphabet[i]>max){
                max = alphabet[i];
                ch=(char)('A'+i);
            } else if(alphabet[i]==max)
                ch = '?';
        }

        System.out.println(ch);



    }
}
