package baekjoon;

import java.util.Scanner;

public class S1_sangsu_2908 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();

        String rev_a= new StringBuilder(a).reverse().toString();
        String rev_b= new StringBuilder(b).reverse().toString();

        if(Integer.parseInt(rev_a)<Integer.parseInt(rev_b)) System.out.println(rev_b);
        else System.out.println(rev_a);

    }
}
