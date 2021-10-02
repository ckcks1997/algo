package algo3_twopointersNslidingwindow;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//3. 최대매출(슬라이딩 윈도우 문제)
//연속된 n일동안의 최대 매출을 구하는 문제

//입력
//첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어집니다.
//두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.

//출력
//첫 줄에 최대 매출액을 출력합니다.

public class Main3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = scanner.nextInt();
        int continuous_day = scanner.nextInt();

        int []arr1 = new int[days];
        for(int i=0; i<days; i++){
            arr1[i] = scanner.nextInt();
        }

        //아래와 같이 풀면 복잡도가 O(n2)가  되어 타임오버가 나기 쉽다..
//        int answer = 0;
//        for(int i = 0; i < days - continuous_day; i++){
//            int sum=0;
//            for(int j = i; j<i+continuous_day; j++){
//                sum+=arr1[j];
//            }
//            if(sum>answer) answer = sum;
//        }
//        System.out.println(answer);

        //슬라이딩 윈도우가 한칸 나아갈때마다 앞 값을 더하고 가장 뒷 값을 빼는 식으로 나아가자
        //복잡도: O(n)
        int slide_sum = 0;
        int max = 0;
        for(int j = 0; j<continuous_day; j++){
            max+=arr1[j];
            max = slide_sum;
        }

        for(int i = 1; i < days - continuous_day; i++){
            slide_sum = slide_sum + arr1[i+continuous_day-1] - arr1[i-1];
            if(slide_sum>max) max = slide_sum;
        }
        System.out.println(max);

    }
}
