package algo2;

import java.util.Scanner;

//4.피보나치 수열
//항 수를 입력하면 첫 줄에 피보나치 수열을 출력한다.
public class Main4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int a = 1, b = 1, c;
        System.out.print(a + " " + b + " ");
        for(int i =2; i < size; i++){
            c = a+b;
            System.out.print(c + " ");
            a=b;
            b=c;
        }

    }
}
