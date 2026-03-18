package BinarySearchTree;


import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left,right;

    Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}

class BinarySearchTree{

    public Node insert(int data,Node root){
            if (root == null) {
                return new Node(data);
            }

            if (root.data >data) {
                root.left = insert(data, root.left);
            }
            if (root.data < data) {
                root.right = insert(data, root.right);
            }
            return root;
    }
    public Node buildTree(int[] node){
        Node root=null;
        for(int data:node){
            if(data != -1){
                root=insert(data,root);
            }
        }
        return root;
    }

    public static boolean findNode(int key,Node root) {
        boolean status = false;
        if (root == null) return false;

        if (root.data == key) {
            status = true;
        } else if (root.data > key) {
            return findNode(key, root.left);
        } else {
            return findNode(key, root.right);
        }
        return status;
    }

    public static Node deleteNode(int key,Node root){
        if(root.data>key){
            root.left=deleteNode(key,root.left);
        }else if(root.data<key){
            root.right=deleteNode(key,root.right);
        }else {
            if(root.left==null && root.right==null){
                return null;
            } else if (root.left==null) {
                return root.right;
            }else if(root.right==null){
                return root.left;
            }
            Node temp=inOrderSuccessor(root.right);
            root.data=temp.data;
            root.right=deleteNode(temp.data,root.right);
        }
        return root;
    }

    public static Node inOrderSuccessor(Node root){
          while(root.left !=null){
              root=root.left;
          }
          return root;
    }

    public void inOrder(Node root){
        if(root==null) return;
        System.out.println(root.data+" ");
        inOrder(root.left);
        inOrder(root.right);
    }

    public void levelOrder(Node root){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node temp=q.poll();
            if(temp==null){
                System.out.println();
                if(!q.isEmpty()) {
                    q.add(null);
                }
            }else {
                System.out.print(temp.data+" ");
                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
            }
        }
    }
}
public class Bst {
    public static void main(String[] args) {
        int[] node = {1,2,3,-1,-1,4,6,-1,9,-1,-1};
        BinarySearchTree ob=new BinarySearchTree();

        Node root= ob.buildTree(node);
        boolean b=BinarySearchTree.findNode(10,root);
        if(b) {
            System.out.println("element found");
        }else{
            System.out.println("value not exist");
        }
       // System.out.println("before deletion");
       // ob.inOrder(root);
        Node newroot=BinarySearchTree.deleteNode(4,root);
       // System.out.println("after deletion");
       // ob.inOrder(newroot);
        ob.levelOrder(root);

    }
}
