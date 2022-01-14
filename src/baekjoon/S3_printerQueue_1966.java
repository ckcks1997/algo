package baekjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class S3_printerQueue_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int tcase = Integer.parseInt(br.readLine());
        for (int i = 0; i < tcase; i++) {
            LinkedList<int[]> queue = new LinkedList<>();
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int amount = Integer.parseInt(st.nextToken());
            int what = Integer.parseInt(st.nextToken());
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < amount; j++) {
                int[] a = {j, Integer.parseInt(st2.nextToken())};
                queue.add(a);
            }

            while(!queue.isEmpty()){
                int[] front = queue.poll();
                boolean isMax = true;
                if(front[1] < queue.get(i)[1]) {
                    queue.offer(front);
                    for(int j = 0; j < i; j++) {
                        queue.offer(queue.poll());
                    }
                    isMax = false;
                    break;
                }
            }

        }
    }
}
