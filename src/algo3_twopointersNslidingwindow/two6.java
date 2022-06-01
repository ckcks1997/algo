package twopointer3;
import java.io.*;
import java.util.*;

public class two6 {
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        int len=scan.nextInt();
        int repl = scan.nextInt();

        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = scan.nextInt();
        }
        

        int ans=0, zero_cnt=0, lt=0;
        for (int i = 0; i < len; i++) {
            if(arr[i]==0) zero_cnt++;
            while(zero_cnt>repl){
                if(arr[lt]==0){
                    zero_cnt--;
                }
                lt++;
            }
            ans = Math.max(ans, i-lt+1);
        }
        System.out.println(ans);

    }
}
