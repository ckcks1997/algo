package algo2;

import java.util.Scanner;

/*
9.격자판 최대합
n*n 격자판의 각 행의 합/열의 합/대각선의 합 중 가장 큰 합을 출력.

입력
첫 줄에 자연수 N이 주어진다.(2<=N<=50)
두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.

출력
최대합을 출력
*/
public class Main9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int [][] arr = new int[size][size];
        for(int i=0; i<size; i++){
            for(int j = 0; j<size; j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        int max = 0;
        for (int i=0; i<size; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j=0; j<size; j++) {
               sum1+=arr[i][j];
               sum2+=arr[j][i];
            }
            if(Math.max(sum1, sum2)>max) max = Math.max(sum1, sum2);
        }

        int sum2 = 0;
        int sum3 = 0;
        for(int i=0; i<size; i++){
            sum2+=arr[i][i];
            sum3+=arr[size-1-i][i];
        }

        max = Math.max(max, Math.max(sum2, sum3));
        System.out.println(max);
    }
}
