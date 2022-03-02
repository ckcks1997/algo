package algo9_greedy;
//1. 씨름선수
//A라는 지원자를 다른 모든 지원자와 일대일 비교해서 키와 몸무게 모두 A지원자 보다 높은
//(크고, 무겁다) 지원자가 존재하면 A지원자는 탈락하고, 그렇지 않으면 선발되는 수를 구하라

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        LinkedList<People> list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            int h = in.nextInt();
            int w = in.nextInt();
            list.add(new People(h,w));
        }

//        list.sort((o1, o2) -> (o1.height < o2.height ? 1:-1)); //정렬
        Collections.sort(list);
        System.out.println(list.toString());//정렬 되었나 확인

        int count=0;
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).weight > max){
                count++;
                max = list.get(i).weight;
            }
        }
        System.out.println(count);
    }
}

class People implements Comparable<People>{
    int height;
    int weight;

    public People(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "People{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }


    public int compareTo(People o) {
        return o.height - this.height ;
    }


}
