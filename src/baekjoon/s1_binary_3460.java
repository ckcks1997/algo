package baekjoon;

import java.util.Scanner;

public class s1_binary_3460 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int tcase = scanner.nextInt();

        for(int i=0; i<tcase; i++){
            int test = scanner.nextInt();
            int count=0;
            while (test!=0){
                if(test%2!=0) System.out.print(count + " ");
                test=test/2;
                count++;
            }
            System.out.println();
        }
    }
}
