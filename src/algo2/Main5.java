package algo2;

import java.util.Scanner;

//5.소수(에라도스테네스 체)
//항 수를 입력하면 첫 줄에 피보나치 수열을 출력한다.
public class Main5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int answer = 0;
        int[] arr = new int[size+1];
        for(int i=2; i<=size; i++){
            if(arr[i] == 0){
                answer++;
                for(int j = i; j<=size; j=j+i){
                    arr[j] = 1;
                }
            }
        }
        System.out.println(answer);
    }
}
