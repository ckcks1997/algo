package algo2;

import java.util.Scanner;

//3. 가위바위보 1:가위~3:보

/**
 * 예시 입력 1
 * 5
 * 2 3 3 1 3
 * 1 1 2 2 3

 * 예시 출력 1
 * A
 * B
 * A
 * B
 * D
 */

public class Main3 {

    //a가 이기면 -1, 비기면 0, b가 이기면 1 리턴
    static int winner(int a, int b){
        if(a == b) return 0;
        else if(a == 1){
            if(b == 2) return 1;
            else return -1;
        }
        else if(a == 2){
            if(b == 1) return -1;
            else return 1;
        }
        else{
            if(b == 1) return 1;
            else return -1;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] a = new int[size];
        int[] b = new int[size];
        int a_win=0;
        int b_win=0;

        for(int i=0; i< size; i++){
            a[i] = scanner.nextInt();
        }
        for(int i=0; i< size; i++){
            b[i] = scanner.nextInt();
            if(winner(a[i], b[i]) == -1) System.out.println("A");
            else if(winner(a[i], b[i]) == 0) System.out.println("D");
            else System.out.println("B");
        }
    }
}
