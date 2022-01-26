package algo7_recursive_tree_graph;

//9. Tree 말단노드까지의 까장 짧은 경로(BFS)

import java.util.LinkedList;
import java.util.Queue;

public class Main10 {
    Node root;


    public int BFS( Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int L = 0;
        while (!q.isEmpty()){
            int len = q.size();
            for (int i = 0; i < len; i++) {
                Node poll = q.poll();
                if(poll.lt == null && poll.rt == null) return L;
                if(poll.lt != null) q.add(poll.lt);
                if(poll.rt != null) q.add(poll.rt);
            }
            L++;
        }
        return 0;
    };

    public static void main(String[] args){
        Main10 tree = new Main10();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);

        System.out.println(tree.BFS( tree.root));

    }
}
