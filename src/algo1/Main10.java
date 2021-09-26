package algo1;

import java.util.Scanner;


public class Main10 {
    public static void main(String[] args) {
        //문자열압축
        Scanner in = new Scanner(System.in);
        String val = in.next() + " ";
        char[] input = val.toCharArray();
        String answer = "";
        int count = 1;

        for(int i=0; i<input.length-1; i++){
            if(input[i] == input[i+1])
                count++;
            else {
                answer += input[i];
                if(count != 1) {
                    answer += count;
                    count = 1;
                }
            }
        }
        //공백 하나 넣으면 안해도 되는거였음 ㅠㅠ
//        if(input[input.length-1] != input[input.length-2]){
//            answer += input[input.length-1];
//        } else{
//            answer += input[input.length-1];
//            answer += count;
//        }

        System.out.println(answer);
    }

}
