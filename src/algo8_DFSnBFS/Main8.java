package algo8_DFSnBFS;

//8. 수열 추측하기

import java.util.Scanner;

public class Main8 {
    static int[][] memo = new int[34][34];
    static int[] multiply_num = null;
    static int[] result=null;
    static int[] num_used = null;
    static int n,r;
    static boolean found = false;

    public static int DFS(int n, int r){
        if(memo[n][r]>0)return memo[n][r];
        if(n==r || r==0) return 1;
        else return memo[n][r]=DFS(n-1, r-1) + DFS(n-1, r);
    }

    public static void DFS2(int L, int sum){
        if(found) return;
        if(L==n){
            if(sum==r){
                for (int i : result) {
                    System.out.print(i+" ");
                }
                found = true;
            }
        }else{
            for (int i = 1; i <=n ; i++) {
                if(num_used[i] == 0){
                    num_used[i]=1;
                    result[L]=i;
                    DFS2(L+1, sum+(result[L]*multiply_num[L]));
                    num_used[i]=0;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        r = in.nextInt();
        multiply_num = new int[n];
        for (int i = 0; i < n; i++) {
            multiply_num[i] = DFS(n-1, i);
        }

        num_used = new int[n+1];
        result = new int[n];

        DFS2(0,0);

    }
}
