package algo2;

import java.util.Scanner;

//7. 가산되는 점수 계산

//문제당 1점, 연속으로 맞출 때마다 1점씩 가산된다.
//첫째 줄에 문제의 개수 N (1 ≤ N ≤ 100)이 주어진다.
// 둘째 줄에는 N개 문제의 채점 결과를 나타내는 0 혹은 1이 빈 칸을 사이에 두고 주어진다.
//0은 문제의 답이 틀린 경우이고, 1은 문제의 답이 맞는 경우이다.
//출력으로 가산점을 고려한 총 점수를 출력한다.
public class Main7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size]; //입력값 저장
        for (int i=0; i<size; i++) {
            arr[i] = scanner.nextInt();
        }

        int answer = 0;
        int combo = 0;
        for (int i : arr) {
            if(i == 1){
                combo++;
                answer+=combo;
            }
            else{
                combo = 0;
            }
        }

        System.out.println(answer);
    }
}
