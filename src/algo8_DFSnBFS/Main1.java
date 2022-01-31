package algo8_DFSnBFS;
//1. 합이 같은 부분집합

//N개의 원소로 구성된 자연수 집합이 주어지면, 이 집합을 두 개의 부분집합으로 나누었을 때
//두 부분집합의 원소의 합이 서로 같은 경우가 존재하면 “YES"를 출력하고, 그렇지 않으면
//”NO"를 출력하는 프로그램을 작성

import java.util.Scanner;

public class Main1 {

    static int size, sum, answer = 0;
    static int[] values, visited;
    public static void DFS(int count, int subtotal){
        if(answer == 1) return;
        else if(count == size){
            if(sum/2 == subtotal) {
                System.out.println("YES");
                answer = 1;
            }
        }else{
            subtotal+=values[count];
            DFS(count+1, subtotal);
            subtotal-=values[count];
            DFS(count+1, subtotal);

        }
        if( count == 0 && answer == 0){
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        size = in.nextInt();
        values = new int[size];
        visited = new int[size];

        for (int i = 0; i < size; i++) {
            values[i] = in.nextInt();
            sum+=values[i];
        }
        if(sum%2 !=0) System.out.println("NO");
        else DFS(0,0);
    }
}
