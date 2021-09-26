package algo1;

import java.util.Scanner;


public class Main9 {
    public static void main(String[] args) {
        //가장 짧은 문자거리
        Scanner in = new Scanner(System.in);
        char[] input = in.next().toCharArray();
        char[] input2 = in.next().toCharArray();

        int[] answer = new int[100];
        int p = 1000;

        for(int i=0; i < input.length; i++){
            if(input[i] != input2[0]){
                p++;
                answer[i] = p;
            } else {
                p = 0;
                answer[i] = p;
            }
        }
        p = 1000;
        for(int i= input.length-1; i >= 0;i--){
            if(input[i] != input2[0]){
                if (answer[i]> p) {
                    p++;
                    answer[i] = p;
                }
            } else {
                p = 0;
                answer[i] = p;
            }
        }

        for (int i=0; i<input.length; i++) {
            System.out.print(answer[i]);
            System.out.print(" ");
        }

    }

}
