package algo6_sortNsearch;
import java.util.*;
public class Main9 {
    public static void main(String[] args) {//1050
       Scanner  sc = new Scanner(System.in);
       int N = sc.nextInt();
       int M = sc.nextInt();
       int[] arr = new int[N];

       int sum=0, max=0;
       for (int i = 0; i < N; i++) {
           arr[i] = sc.nextInt();
           sum+=arr[i];
           if(max<arr[i]) max = arr[i];
       }

       int lt = max, rt = sum, mid = 0, ans = 0;
       while(lt<=rt){
           mid = (lt+rt)/2;
           int cnt = 1, sum2=0;
           for (int i = 0; i < N; i++) {
               if(sum2+arr[i]<=mid) sum2+=arr[i];
               else{
                   cnt++;
                   sum2 = arr[i];
               }
           }

           if(cnt<=M) {
            ans = mid;
            rt = mid - 1;
           }
           else lt = mid + 1;
       }
       System.out.println(ans);
    }
}
