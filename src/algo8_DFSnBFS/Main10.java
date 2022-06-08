package algo8_DFSnBFS;
import java.util.*;
//미로탐색 dfs
public class Main10 {

    static int[][] arr = new int[7][7];
    static int[] dx = {0,1,0,-1};
    static int[] dy = {-1,0,1,0};
    static int cnt = 0;

    static void DFS(int x, int y){
        if(x<0 || y<0 || y>6 || x>6) return;
        if(x==6&&y==6){
            cnt++;
            return;
        }
        else if(arr[x][y] == 0){
            arr[x][y] = 1;
            for (int i = 0; i < 4; i++) {
                DFS(x+dx[i], y+dy[i]);
            }
            arr[x][y] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                 arr[j][i] = sc.nextInt();
            }
        }


        DFS(0,0);

        System.out.println(cnt);
    }
}
