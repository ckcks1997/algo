package baekjoon;

// https://www.acmicpc.net/problem/1260

import java.util.*;

public class S3_DFS_1260 {
    
    static int jungjum, gansun, start;
    static TreeMap<Integer, HashSet<Integer>> lines;
    static int[] visited;

    static void DFS( int a){
        visited[a] = 1;
        System.out.print(a + " ");
        for (Integer integer : lines.get(a)) {
            if(visited[integer] == 0) {
                DFS(integer);
            }
        }
    }

    static void BFS(int a){
        Queue<Integer> q = new LinkedList<>();
        q.offer(a);
        visited[a] = 1;
        System.out.print(a+" ");
        while(!q.isEmpty()){
             Integer val = q.poll();
            for (Integer integer : lines.get(val)) {
             if(visited[integer] == 0){
                 q.offer(integer);
                 visited[integer] = 1;
                 System.out.print(integer+" ");
             }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        jungjum = in.nextInt();
        gansun = in.nextInt();
        start = in.nextInt();
        visited = new int[1001];
        lines = new TreeMap<>();

        for (int i = 0; i < gansun; i++) {
            int x = in.nextInt();
            int y = in.nextInt();

            if(lines.get(x) == null){
                lines.put(x,new HashSet<>());
            }
            if(lines.get(y) == null){
                lines.put(y,new HashSet<>());
            }
            lines.get(x).add(y);
            lines.get(y).add(x);
        }

        DFS(start);
        System.out.println();
        visited = new int[1001];
        BFS(start);
    }
}
