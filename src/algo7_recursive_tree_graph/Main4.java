package algo7_recursive_tree_graph;


//피보나치 재귀(메모이제이션) 10 -> 1 1 2 3 5 8 13 21 34 55
//재귀는 stack frame을 사용하기 때문에 메모이제이션을 이용한 for문 풀이가 더 성능이 좋다
//코드는 아래와 같다.
//재귀방법은 배열 저장없이 solution 계속 돌리니 느릴 수 밖에..
public class Main4 {

    static int[] fibo;
    
    public int solution(int n){
        if(fibo[n]>0) return fibo[n];
        if(n==1 || n==2) return 1;
        else {
            fibo[n] = solution(n-1)+solution(n-2);
            return fibo[n];
        }
    }

    public static void main(String[] args){
        Main4 T = new Main4();
        int n = 45;
        fibo = new int[n+1];
        T.solution(n);
        for (int i : fibo) {
            System.out.print(i+" ");
        }
    }
}
