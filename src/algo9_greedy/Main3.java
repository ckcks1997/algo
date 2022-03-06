package algo9_greedy;

//3.결혼식

//첫째 줄에 피로연에 참석할 인원수 N(5<=N<=100,000)이 주어집니다.
//
//두 번째 줄부터 N줄에 걸쳐 각 인원의 오는 시간과 가는 시간이 주어집니다.
//
//시간은 첫날 0시를 0으로 해서 마지막날 밤 12시를 72로 하는 타임라인으로 오는 시간과 가는 시간이 음이 아닌 정수로 표현됩니다.
//첫째 줄에 피로연장에 동시에 존재하는 최대 인원을 출력


import java.util.*;

public class Main3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        ArrayList<Time2> list = new ArrayList<>(); //이걸 왜 LinkedList로 했지..
        for (int i = 0; i < size; i++) {
            int s = in.nextInt();
            int e = in.nextInt();
            list.add(new Time2(s,0));
            list.add(new Time2(e,1));
        }

        Collections.sort(list);
        System.out.println(list);
        int cnt=0;
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).alphabet == 0) cnt++;
            else cnt--;
            if(max<cnt) max = cnt;
        }
        System.out.println(max);
    }
}

class Time2 implements Comparable<Time2>{
    int time;
    int alphabet; // 0=s/1=e

    public Time2(int time, int alphabet) {
        this.time = time;
        this.alphabet = alphabet;
    }

    @Override
    public String toString() {
        return "Time2{" +
                "time=" + time +
                ", alphabet=" + alphabet +
                '}';
    }

    @Override
    public int compareTo(Time2 o) {
        if(this.time!= o.time) return this.time - o.time;
        else return o.alphabet - this.alphabet;
    }
}
