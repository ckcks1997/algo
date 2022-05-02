package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/1253
public class S1_Good_1253 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        if(total<2) System.out.println(0);
        else{
            long[] arr = new long[total];
            for (int i = 0; i < total; i++) {
                arr[i] = Long.parseLong(st.nextToken());
            }

            Arrays.sort(arr);
                long ans=0;
            for (int i = 0; i < total; i++) {
                int start=0;
                int end=total -1;
                long find = arr[i];
                while(start < end) {
                    if(start == i) start++;
                    else if(end == i) end--;
                    else {
                    if (arr[start] + arr[end] == find) {
                        ans++;
                        break;
                    }
                    else if (arr[start] + arr[end] < find)
                        start++;
                    else if (arr[start] + arr[end] > find)
                        end--;
                    }
                }
            }

            System.out.println(ans);
            br.close();
        }

    }
}
