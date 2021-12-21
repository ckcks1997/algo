package algo5_stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//6.공주구하기

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int answer = 0;
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i++) q.offer(i);
        while(!q.isEmpty()){
            for (int j = 1; j < k; j++) q.offer(q.poll());
            q.poll();
            if(q.size() == 1) System.out.println(q.poll());
        }

    }
}
