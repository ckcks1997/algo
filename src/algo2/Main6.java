package algo2;

import java.util.Scanner;

//6.뒤집은 소수(에라도스테네스 체 변형)
//갯수와 그 수가 주어지면 수를 뒤집어, 소수이면 모아서 string으로 출력한다.
public class Main6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size]; //입력값 저장
        int[] converted = new int[size]; //뒤집은 값 저장
        int max = 0; //가장 큰 값 저장
        String answer = "";//출력할 정답

        //값 입력
        for(int i=0; i<size; i++){
            arr[i] = scanner.nextInt();
        }

        //값을 하나씩 받아서 뒤집은다음 converted배열에 저장한다.
        for(int i = 0; i<size; i++){
            int res = 0;
            int tmp = arr[i];
            while(tmp>0) {
                res = res * 10 + (tmp % 10);
                tmp = tmp / 10;
            }
            if(max<res) max = res;
            converted[i] = res;
        }

        int[] arr2 = new int[max+1]; //소수 판별 배열
        arr2[0] = 1;
        arr2[1] = 1;

        //뒤집은 수 중에 가장 큰 수를 기준으로 그 수만큼 배열을 만들어 소수 판별 배열을 만든다.(0이면 소수)
        for (int i=2; i<=max; i++){
            if(arr2[i] == 0){
                for(int j = i*2; j<=max; j = j+i){
                    arr2[j] = 1;
                }
            }
        }

        //판별 배열을 보고 소수인지 판단한다.
        for (int j : converted) {
            if (arr2[j] == 0) answer = answer + (j + " ");
        }

        System.out.println(answer);
    }
}
