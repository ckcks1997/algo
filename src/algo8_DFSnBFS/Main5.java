package algo8_DFSnBFS;
//5. 동전교환

//첫 번째 줄에는 동전의 종류개수 N(1<=N<=12)이 주어진다. 두 번째 줄에는 N개의 동전의 종
//류가 주어지고, 그 다음줄에 거슬러 줄 금액 M(1<=M<=500)이 주어진다.
//각 동전의 종류는 100원을 넘지 않는다.
//출력설명
//첫 번째 줄에 거슬러 줄 동전의 최소개수를 출력한다.
// 입력예제
//3
//1 2 5
//15
// 출력예제
//3

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main5 {

    static int  size, targetVal, ans=Integer.MAX_VALUE;
    static Integer[] values;
    public static void DFS(int count, int subtotal){
        if(targetVal<subtotal || count >=ans) return;
        else if(targetVal == subtotal) {
            if(ans>count) ans = count;
            return;
        } else {
            for (int i = 0; i <size; i++) {
            DFS(count+1,subtotal+values[i]);
            }
        }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        size = in.nextInt();
        values = new Integer[size];
        for (int i = 0; i < size; i++) {
            values[i] = in.nextInt();
        }


        Arrays.sort(values, Collections.reverseOrder());
        targetVal = in.nextInt();

        DFS(0,0);

        System.out.println(ans);

    }
}
