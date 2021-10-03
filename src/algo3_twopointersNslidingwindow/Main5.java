package algo3_twopointersNslidingwindow;

//5. 연속된 자연수의 합
//N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int lpt = 1, sum=0, answer = 0;
        for(int i=1; i<=size/2+1; i++){
            sum += i;
            while (sum>=size) {
            if (sum == size) answer++;
                sum -= lpt;
                lpt++;
            }
        }
        System.out.println(answer);
    }
}
