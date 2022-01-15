package baekjoon;

import java.io.*;

//에라토스테네스의 체를 이용한 소수 문제
public class S2_getSosu_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int start = Integer.parseInt(s[0]);
        int end = Integer.parseInt(s[1]);

        int isSosu[] = new int[end+1];
        isSosu[0] = 1;
        isSosu[1] = 1;
        for (int i = 2; i <=Math.sqrt(end); i++) { //sqrt를 해야 오버플로우가 나지 않는다.
            if(isSosu[i] == 0){

                for (int j = i*i; j <= end; j+=i) {
                    isSosu[j]=1;
                }
            }
        }

        for (int i = start; i < isSosu.length; i++) {
            if(isSosu[i]==(0)){
                bw.write(i+"\n");
            }
        }
        bw.flush();
    }
}
