package algo1;

import java.util.ArrayList;
import java.util.Scanner;


public class Main5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = in.next();

        char[] s = input.toCharArray();
        int lt=0, rt=s.length-1;
        while(lt<rt){
            if(Character.isAlphabetic(s[lt]) && Character.isAlphabetic(s[rt])){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
                continue;
            }
            if(!Character.isAlphabetic(s[lt])){
                lt++;
            }
            if(!Character.isAlphabetic(s[rt])){
                rt--;
            }

        }
        System.out.println(String.valueOf(s));

    }
}
