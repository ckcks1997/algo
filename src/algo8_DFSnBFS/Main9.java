package algo8_DFSnBFS;
import java.util.*;
public class Main9 {

    static int n,r;
    static int[]  arr ;

    static void DFS(int lvl, int current){
        
        if(lvl == r){
            for(int i:arr){
                System.out.print(i+" ");
            }
            System.out.println();
        }else{
            for(int i=current; i<= n; i++){
                
                arr[lvl] = i;
                DFS(lvl+1, i+1);
                
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         r = sc.nextInt();
         arr = new int[r];
         DFS(0,1);
    }
}
