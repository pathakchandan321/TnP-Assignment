package treebasic;
class Node{
    int data;
    Node right,left;

    Node(int data) {
        this.data = data;
        this.right=null;
        this.left=null;
    }
}
class BuildTree{
    static int index=-1;
    public static Node InsertNode(int nodes[]){
        index++;
        if(nodes[index]==-1 ){
            return null;
        }

        Node newNode=new Node(nodes[index]);
        newNode.left=InsertNode(nodes);
        newNode.right=InsertNode(nodes);

        return newNode;


    }

    public static void printTree(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);
    }
}
public class BinaryTree {
    public static void main(String[] args) {
        int nodes[]={2,3,-1,4,-1,-1,5,6,-1,-1,-1};
        Node root=BuildTree.InsertNode(nodes);
        BuildTree.printTree(root);
    }
}
