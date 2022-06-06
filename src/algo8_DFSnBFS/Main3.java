package algo8_DFSnBFS;
import java.util.*;
public class Main3 {

    static ArrayList<Problem> li;
    static int N,M, max;

    public static void DFS(int sum, int time, int lvl){
        if(time> M)return; 
        else if(lvl == N){
            if(max<sum) max=sum;
        }
        else{
            DFS(sum+li.get(lvl).score, time+li.get(lvl).time, lvl+1 );
            DFS(sum, time, lvl+1 );
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        li = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            li.add(new Problem(sc.nextInt(), sc.nextInt()));
        }

         DFS(0,0,0);
        System.out.println(max);


    }
}

class Problem {
    int score;
    int time;
    Problem(int a, int b){
        this.score = a;
        this.time = b;
    }

  

}
