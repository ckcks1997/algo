package algo7_recursive_tree_graph;


//재귀함수
//숫자출력 3 입력시 123 출력
public class Main1 {

    public void solution(int n){
        if(n == 0) return;
        else {
            solution(n - 1);
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args){
        Main1 T = new Main1();
        T.solution(3);
    }
}
