package hashmaptreeset4;
import java.util.*;
public class Hash5 {
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();//총 자연수 갯수
        int K = scan.nextInt();//내림차수정렬 몇번째
        int[] arr =new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }

        TreeSet<Integer> ts = new TreeSet<>(Collections.reverseOrder());
       
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j+1; k < N; k++) {
                    ts.add(arr[i]+arr[j]+arr[k]);
                }
            }
        }
        for (int i = 0; i < K-1; i++) {
            ts.pollFirst();
        }
        System.out.println( ts.pollFirst());
   } 
}
