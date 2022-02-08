package algo8_DFSnBFS;


//조합수(메모이제이션) nCr 을 구하는 문제
//입력:n,r 출력: nCr의 값

import java.util.Scanner;

public class Main7 {
    int[][] memo = new int[34][34];
    public int DFS(int n, int r){
        if(memo[n][r]>0)return memo[n][r];
        if(n==r || r==0) return 1;
        else return memo[n][r]=DFS(n-1, r-1) + DFS(n-1, r);
    }
    public static void main(String[] args) {
        Main7 T = new Main7();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();
        System.out.println(T.DFS(n,r));
    }
}
