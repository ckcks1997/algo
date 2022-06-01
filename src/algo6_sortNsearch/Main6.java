package algo6_sortNsearch;
import java.util.*;
public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int[] arr = new int[total];

        for (int index = 0; index < total; index++) {
            arr[index] = sc.nextInt();
        }

        int[] arr_sorted =arr.clone();
        Arrays.sort(arr_sorted);

        for (int i = 0; i < total; i++) {
            if(arr[i] != arr_sorted[i]) System.out.print(i+1+" ");
        }

    }
}
