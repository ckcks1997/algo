package algo9_greedy;

//2. 회의실 배정
//첫째 줄에 회의의 수 n(1<=n<=100,000)이 주어진다. 둘째 줄부터 n+1 줄까지 각 회의의 정
//보가 주어지는데 이것은 공백을 사이에 두고 회의의 시작시간과 끝나는 시간이 주어진다.
//첫째 줄에 최대 사용할 수 있는 회의 수를 출력하여라.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        ArrayList<Time> list = new ArrayList<>(); //이걸 왜 LinkedList로 했지..
        for (int i = 0; i < size; i++) {
            int h = in.nextInt();
            int w = in.nextInt();
            list.add(new Time(h,w));
        }

        Collections.sort(list);

        int count=0;
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if(max <= list.get(i).start){
                count++;
                max = list.get(i).end;
            }
        }
        System.out.println(count);
    }
}

class Time implements Comparable<Time>{
    int start;
    int end;

    public Time(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Time o) {
        if(this.end!= o.end) return this.end - o.end;
        else return this.start - o.start;
    }
}
