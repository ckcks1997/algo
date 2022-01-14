package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//BufferedReader와 writer 적용 문제
public class S1_aplusb_15552 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            String[] in = (br.readLine()).split(" ");
            bw.write(Integer.parseInt(in[0])+Integer.parseInt(in[1])+"\n");
        }

        bw.flush();
    }
}
