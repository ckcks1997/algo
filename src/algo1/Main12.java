package algo1;

import java.util.ArrayList;
import java.util.Scanner;
public class Main12 {
    public static void main(String[] args) {
        //암호
        Scanner in = new Scanner(System.in);
        int length = Integer.parseInt(in.nextLine());
        String enc = in.nextLine();

        ArrayList<String> arrEnc = new ArrayList<>();
        String answer = "";
        for(int i=0; i<length; i++){
            arrEnc.add(enc.substring(i*7, (i*7)+7));
        }

        for (String s : arrEnc) {
            int sum=0;
            for(int i=0; i<7; i++){
                if(s.charAt(i) == '#'){
                    sum += Math.pow(2, 6-i);
                }
            }
            answer += (char)(sum);
        }
        System.out.println(answer);
    }
}