package programmers;

import java.util.Locale;

public class S1_newId_72410 {

        public String solution(String new_id) {
            new_id=new_id.toLowerCase();
            new_id=new_id.replaceAll("[^a-z0-9-_.]","");
            String answer = "";
            return new_id;
        }


    public static void main(String[] args) {
        S1_newId_72410 T = new S1_newId_72410();
        System.out.println(T.solution("...!@BaT#*..y.abcdefghijklm"));
    }
}
