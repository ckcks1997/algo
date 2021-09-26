package algo1;

import java.util.Scanner;



public class Main2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();

        String answer = "";
        //1.Character와 String.toCharArray이용방법
        for (char x : input1.toCharArray()) {
            if(Character.isUpperCase(x)){
                answer+=Character.toLowerCase(x);
            }else answer+=Character.toUpperCase(x);
        }

        //2.ASCII방법, 대문자는 65~90사이, 소문자는 97~122사이로 32 차이가 난다.
        for (char x : input1.toCharArray()) {
            if(x>64 && x<97){
                answer += (char)(x+32);
            }else answer += (char)(x-32);
        }
        System.out.println(answer);

    }
}
