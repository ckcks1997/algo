package algo2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
//        2.보이는 학생
//        선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
//        선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요.

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] arr = new int[size];
        int sum = 1;
        arr[0]=(scanner.nextInt());
        int tallest = arr[0];
        for(int i=1; i<size; i++){
            arr[i]=(scanner.nextInt());
            if(arr[i]>tallest){
                sum++;
                tallest = arr[i];
            }
        }
        System.out.println(sum);

    }
}
