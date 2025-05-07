package Trees;

public class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
// to represent binary tree as array, index nodes left to right including missing nodes
// formulas for node at idx i:
// left child: 2i + 1
// right child: 2i + 2
// parent if you are left: |i / 2|
// parent if you are right: |i - 1 / 2|

// full binary tree: max nodes = 2^(h + 1) - 1
// complete binary tree should be filed with left: height = log n