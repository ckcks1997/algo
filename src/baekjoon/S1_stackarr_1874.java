package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class S1_stackarr_1874 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer bw = new StringBuffer();

        int n = Integer.parseInt(br.readLine());
        int cnt= 1;

        Stack<Integer> st = new Stack();

        for (int i = 0; i < n; i++) {
            int in = Integer.parseInt(br.readLine());
            if(cnt <=in) {
                while (in >= cnt) {
                    bw.append("+\n");
                    st.push(cnt++);
                }
                bw.append("-\n");
                st.pop();
            }
            else{
                int pop = st.pop();
                if(pop > in){
                    System.out.println("NO");
                    return;
                }
                else{
                    bw.append("-\n");
                }
            }

        }
        System.out.println(bw.toString());
    }
}
