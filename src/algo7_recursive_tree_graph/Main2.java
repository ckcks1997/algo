package algo7_recursive_tree_graph;


//재귀함수 2진수 출력, 11 -> 1011
public class Main2 {

    public void solution(int n){
        if(n == 0) return;
        else {
                solution(n/2);
                System.out.print(n%2);
        }
    }

    public static void main(String[] args){
        Main2 T = new Main2();
        T.solution(11);
    }
}
