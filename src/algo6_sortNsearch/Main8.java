package algo6_sortNsearch;
import java.util.*;

public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr); 

        int lt = 0;
        int rt = N-1; 
        int ans = -1;
        while(lt<=rt){ 
            int mid = (lt+rt)/2;
            if(arr[mid] == M) {
                ans = mid+1;
                break;
            } else if(arr[mid] < M){
                lt = mid+1;
            }else{
                rt = mid-1; 
            }
        }

        System.out.println(ans);
    }
}
