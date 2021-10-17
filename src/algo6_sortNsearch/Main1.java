package algo6_sortNsearch;


import java.util.HashMap;
import java.util.Scanner;

//1.선택정렬
//설명
//N개의 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
//정렬하는 방법은 선택정렬입니다.

//입력
//첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
//두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.

//출력
//오름차순으로 정렬된 수열을 출력합니다.

//예시 입력 1
//6
//13 5 11 7 23 15
//예시 출력 1
//5 7 11 13 15 23

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] arr = new int[a];
        for(int i=0; i<a; i++){
            arr[i] = scanner.nextInt();
        }

        for(int j=0; j<a; j++){
            int point = j;
            for (int k=j+1; k<a; k++){
                if(arr[point] > arr[k]) point = k;
            }
            int tmp = arr[j];
            arr[j] = arr[point];
            arr[point] = tmp;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
