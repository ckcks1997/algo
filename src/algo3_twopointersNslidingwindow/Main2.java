package algo3_twopointersNslidingwindow;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//2. 공통원소 구하기(two pointer)
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        long []arr1 = new long[a];
        for(int i=0; i<a; i++){
            arr1[i] = scanner.nextLong();
        }
        Arrays.sort(arr1);

        int b = scanner.nextInt();
        long[]arr2 = new long[b];
        for(int i=0; i<b; i++){
            arr2[i] = scanner.nextLong();
        }
        Arrays.sort(arr2);

        int p1 = 0, p2 = 0;
        ArrayList<Long> answer = new ArrayList<>();
        while(p1 < a && p2 < b){
            if(arr1[p1] == arr2[p2]){
                answer.add(arr1[p1++]);
                p2++;
            }
            else if(arr1[p1] < arr2[p2])
                p1++;
            else p2++;
        }

        for (long i : answer) {
            System.out.print(i + " ");
        }

    }
}
