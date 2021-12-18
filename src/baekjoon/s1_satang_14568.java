package baekjoon;

import java.util.Scanner;
//간단한 완전탐색 문제
public class s1_satang_14568 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int input1 = scanner.nextInt();
        int count = 0;
        for(int a=2; a<input1-1; a+=2){
            for(int b=1; b<input1-a; b++){
                for(int c = 1; c<=input1-a-b; c++){
                    if(c>=b+2 && input1-a-b-c == 0) count++;
                }
            }
        }
        System.out.println(count);
    }
}
