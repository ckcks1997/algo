package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//백준 숨바꼭질
//https://www.acmicpc.net/problem/1697


class Node {
    int a, b;

    public Node(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

public class S2_sumba_1697 {
    static int N, K, ans;
    static int[] visited = new int[100002];
    static boolean found;
    static Queue<Node> q = new LinkedList<>();

    static void BFS() {
        while (!q.isEmpty()) {
            Node poll = q.poll();
            if (found) break;
            if (poll.b == K) {
                ans = poll.a;
                found = true;
            } else if (poll.b>=0 && poll.b<=100000 && visited[poll.b] == 0) { // 여기서 경계값 신경을 안써서 통과가 안됐었다..
                visited[poll.b] = 1;
                q.add(new Node(poll.a + 1, poll.b + 1));
                q.add(new Node(poll.a + 1, poll.b - 1));
                q.add(new Node(poll.a + 1, poll.b * 2));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        K = scan.nextInt();
        q.add(new Node(0, N));
        BFS();
        System.out.println(ans);
    }
}
