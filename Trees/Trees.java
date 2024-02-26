package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Trees {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        int answer = q.remove();
        System.out.println(answer);
    }  
    

    // static boolean fullBinaryTree(Node root) {

    // if(root == null) return true;

    // if(root.left == null && root.right == null) return true;

    // if(root.left != null && root.right != null) {
    //     return fullBinaryTree(root.left) && fullBinaryTree(root.right);
    // }

    // return false;
    // }

}


