package algo7_recursive_tree_graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//14. 경로탐색(인접리스트, ArrayList)
public class Main14 {

    static int n, m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] visited;
    static int[] dis;
    public void BFS(int v){
        Queue<Integer> queue = new LinkedList<>();
        visited[v] = 1;
        dis[v] = 0;
        queue.offer(v);
        while(!queue.isEmpty()){
            int cv = queue.poll();
            for (Integer nv : graph.get(cv)) {
                if(visited[nv]==0){
                    visited[nv]=1;
                    queue.offer(nv);
                    dis[nv]=dis[cv]+1;
                }
            }
        }
    }


    public static void main(String[] args) {
        Main14 T = new Main14();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt(); //node갯수
        m = kb.nextInt(); //간선의 갯수
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        visited = new int[n+1];
        dis = new int[n+1];
        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }

        T.BFS(1);
        for (int i = 0; i < dis.length; i++) {
            if(dis[i]!=0) System.out.println(i+":"+dis[i]);
        }
    }
}
