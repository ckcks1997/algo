package baekjoon;

import java.util.*;
import java.io.*;

public class s2_stack_10828 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));

        int prompt =Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < prompt; i++) {

            StringTokenizer tk = new StringTokenizer(br.readLine(), " ");
            String val = tk.nextToken();
            if(val.equals("push")){
                stack.push(Integer.parseInt(tk.nextToken()));
            }
            else if(val.equals("top")){
                if(stack.size()!=0) bw.write(stack.peek()+"\n");
                else bw.write(-1+"\n");
            }
            else if (val.equals("size")) {
                bw.write(stack.size()+"\n");
            }
            else if (val.equals("pop")) {
                if(stack.size()!=0) bw.write(stack.pop()+"\n");
                else bw.write(-1+"\n");
            }
            else if (val.equals("empty")) {
                if(stack.size()!=0) bw.write(0+"\n");
                else bw.write(1+"\n");
            } else continue;
        }
        bw.flush();
    }
}
