package algo7_recursive_tree_graph;

//부분집합 구하기(깊이탐색)

import java.util.Scanner;

public class Main6 {

    static int n; // 입력값
    static int[] ch;// 참/거짓

    public void DFS(int L){

        if(L == n+1){
            String tmp = "";
            for(int i=1; i<=n; i++){
                if(ch[i]==1) tmp+= (i+" ");
            }
            if(tmp.length()>0) System.out.println(tmp);
        }
        else{
            ch[L]=1;
            DFS(L+1);
            ch[L]=0;
            DFS(L+1);
        }
    }

    public static void main(String[] args){
        Main6 tree = new Main6();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        ch = new int[n+1];
        tree.DFS(1);

    }
}
