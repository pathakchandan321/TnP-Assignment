package BinaryTree;
class Node{
    int data;
    Node left,right;

    Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
class BinaryTree{
    static int index=-1;
    public static Node buildTree(int[] node){
        index++;
        if(index>=node.length) return null;

        if(node[index]==-1){
            return null;
        }

        Node newNode=new Node(node[index]);

        newNode.left=buildTree(node);
        newNode.right=buildTree(node);
        return newNode;
    }

    public static void inOrder(Node root){
        if(root==null) return;
        System.out.println(root.data+" ");
        inOrder(root.left);
        inOrder(root.right);
    }
}
public class Tree {
    public static void main(String[] args) {
        int[] node={1,2,3,-1,-1,4,6,-1,9,-1,-1};
        Node root=BinaryTree.buildTree(node);
        BinaryTree.inOrder(root);
    }
}
