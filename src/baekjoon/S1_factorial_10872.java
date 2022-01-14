package baekjoon;

import java.io.*;

public class S1_factorial_10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i = Integer.parseInt(br.readLine());

        int result = 1;
        for (int j = i; j >0 ; j--) {
            result*=j;
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
