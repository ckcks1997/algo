package algo5_stackqueue;
import java.util.*;
public class Stackq8 { //2:00~
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int who = sc.nextInt();

        Queue<Patient> q = new LinkedList<>();
        for (int i = 0; i < total; i++) {
            q.add(new Patient(i, sc.nextInt()));
        }

        int cnt=0;
        while(q.size() != 0){
            int max = 0, found=0;
            for (int i = 0; i < q.size(); i++) { //최대값 찾기
                Patient p = q.poll();
                if(p.priority> max) max = p.priority;
                q.add(p);
            }

            for (int i = 0; i < q.size(); i++) {
                Patient p = q.poll();
                if(p.priority == max){
                    cnt++;
                    if(p.idx == who) found = 1;
                    break;
                } else q.add(p);
            }

            if(found == 1) break;
        }
        System.out.println(cnt);
    }
}

class Patient{

    public int idx;
    public int priority;
    Patient(int a, int b){
        this.idx=a;
        this.priority = b;
    }
}
