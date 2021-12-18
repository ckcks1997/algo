package algo7_recursive_tree_graph;

//BFS 트리탐색

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//class Node{
//    int data;
//    Node lt, rt;
//    public Node(int val){
//        data = val;
//        lt=rt=null;
//    }
//}

public class Main7 {
    Node root;

    public void BFS(Node root){
        Queue<Node> Q = new  LinkedList<>(); // <- 먼저 들어간게 먼저나오는게 중요해서 큐를 사용
        Q.offer(root); //큐에 값 삽입
        int L = 0; //<- 레벨로 찾는거 중요
        while (!Q.isEmpty()){
            int len = Q.size();
            System.out.print(L + " : ");
            for(int i = 0; i<len; i++) {
                Node cur = Q.poll(); //큐에서 값을 가져오고 삭제
                System.out.print(cur.data + " ");
                if (cur.lt != null) Q.offer(cur.lt);
                if (cur.rt != null) Q.offer(cur.rt);
            }
            L++;
            System.out.println();
        }

    }

    public static void main(String[] args){
        Main7 tree = new Main7();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.BFS(tree.root);

    }
}
