package algo7_recursive_tree_graph;

//BFS 송아지찾기

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main8 {
    int[] dis = {1,-1,5};
    int[] visited;
    Queue<Integer> Q = new LinkedList<>();
    public int BFS(int s, int e){

        visited = new int[10001];
        visited[s] = 1;
        Q.offer(s);
        int level = 0;
        while (!Q.isEmpty()){
            int len = Q.size();

            for(int i =0; i<len; i++){
                int x = Q.poll();

                for(int j = 0; j<3; j++){
                    int nx = x + dis[j];
                    if(nx == e) {
                        return level+1;
                    }
                    if(nx>=1 && nx<=10000 && visited[nx] ==0){
                        visited[nx] = 1;
                        Q.offer(nx);
                    }
                }

            }

            level++;
        }
        return 0;
    }

    public static void main(String[] args){
        Main8 tree = new Main8();
        Scanner scanner = new Scanner(System.in);
        int s= scanner.nextInt();
        int e= scanner.nextInt();
        System.out.println(tree.BFS(s,e));

    }
}
