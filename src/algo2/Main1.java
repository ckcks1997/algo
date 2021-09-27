package algo2;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        //1. 앞 수보다 큰 수만 출력하기
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] arr = new int[size+1];
        String answer = "";
        arr[0] = 0;
        for(int i=0; i<size; i++){
            arr[i+1]=(scanner.nextInt());
            if(arr[i] < arr[i+1]) answer+=arr[i+1] + " ";
        }

        answer = answer.substring(0,answer.length()-1);
        System.out.println( answer);
    }
}
