package algo8_DFSnBFS;
import java.util.*;
//미로탐색 bfs
class Japyo{
    public int x;
    public int y;
    Japyo(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class Main11 {

    static int[][] arr = new int[7][7];
    static int[][] min_arr = new int[7][7];
    static int[] dx = {0,1,0,-1};
    static int[] dy = {-1,0,1,0};
    static int cnt = 0;

    static void BFS(int x, int y){
        Queue<Japyo> q = new LinkedList<>();

        q.offer(new Japyo(x,y));

        while(!q.isEmpty()){
            cnt++;
            int q_size = q.size();
            for (int i = 0; i < q_size; i++) {
                Japyo p = q.poll();
                for (int j = 0; j < 4; j++) {
                    if(p.x+dx[j]>=0 && p.x+dx[j]<7 && p.y+dy[j]>=0 && p.y+dy[j]<7){
                        if(arr[p.x+dx[j]][p.y+dy[j]] == 0 && (min_arr[p.x+dx[j]][p.y+dy[j]] ==0 || min_arr[p.x+dx[j]][p.y+dy[j]] > cnt)){
                            min_arr[p.x+dx[j]][p.y+dy[j]] = cnt;
                            q.add(new Japyo(p.x+dx[j], p.y+dy[j]));
                        }
                    }
                }
            }
            
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                 arr[j][i] = sc.nextInt();
            }
        }


        BFS(0,0);

        System.out.println(min_arr[6][6]);
    }
}
