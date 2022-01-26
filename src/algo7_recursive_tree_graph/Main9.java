package algo7_recursive_tree_graph;

//9. Tree 말단노드까지의 까장 짧은 경로(DFS)

public class Main9 {
    Node root;


    public int DFS(int L, Node root){
        int lt;
        int rt;
        if(root == null) return L-1;
        else{
             lt = DFS(L+1, root.lt);
             rt = DFS(L+1, root.rt);
        }
        return Math.min(lt,rt);
    }

    public static void main(String[] args){
        Main9 tree = new Main9();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);

        System.out.println(tree.DFS(0, tree.root));

    }
}
