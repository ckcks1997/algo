package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//BufferedReader와 writer 적용 문제
public class S1_partsum_11659 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer count = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(count.nextToken());
        int M = Integer.parseInt(count.nextToken());

        StringTokenizer value = new StringTokenizer(br.readLine());

        int[] arr = new int[N+1];
        int sum=0;
        for (int i = 1; i <= N; i++) {
            sum+= Integer.parseInt(value.nextToken());
            arr[i]=sum;
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            System.out.println(arr[end]-arr[start-1]);
        }

    }
}
