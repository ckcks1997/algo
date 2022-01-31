package algo8_DFSnBFS;
//2. 바둑이 승차 문제(DFS)

//철수는 그의 바둑이들을 데리고 시장에 가려고 한다. 그런데 그의 트럭은 C킬로그램 넘게 태
//울수가 없다. 철수는 C를 넘지 않으면서 그의 바둑이들을 가장 무겁게 태우고 싶다.

//입력설명
//첫 번째 줄에 자연수 C(1<=C<=100,000,000)와 N(1<=N<=30)이 주어집니다.
//둘째 줄부터 N마리 바둑이의 무게가 주어진다.

//첫 번째 줄에 가장 무거운 무게를 출력한다

import java.util.Scanner;

public class Main2 {

    static int maxWeight, size, foundedMaxWeight;
    static int[] values;
    public static void DFS(int count, int subtotal){
        if(count == size){
            if(maxWeight>subtotal && foundedMaxWeight<subtotal){
                foundedMaxWeight = subtotal;
            }
            return;
        }else if(subtotal>maxWeight){ return;}
        else {
            subtotal+=values[count];
            DFS(count+1, subtotal);
            subtotal-=values[count];
            DFS(count+1, subtotal);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        maxWeight = in.nextInt();
        size = in.nextInt();
        values = new int[size];
        for (int i = 0; i < size; i++) {
            values[i] = in.nextInt();
        }

        DFS(0,0);
        System.out.println(foundedMaxWeight);
    }
}
