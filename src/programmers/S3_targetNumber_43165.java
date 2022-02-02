package programmers;

import java.util.Scanner;

public class S3_targetNumber_43165 {


    static int cnt = 0;
    static int total = 0;

    public static void DFS(int idx, int[] numbers, int target){
        int size = numbers.length;
        if(idx==size){
            if(target==total){
                cnt++;
                return;
            }
            else return;
        }
        else {
            total += numbers[idx];
            DFS(idx + 1, numbers, target);
            total -= numbers[idx]*2;
            DFS(idx + 1, numbers, target);
            total += numbers[idx];
        }
    }
    public static int solution(int[] numbers, int target) {

        DFS(0, numbers, target);
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1};
        System.out.println(solution(arr, 3));
    }
}

