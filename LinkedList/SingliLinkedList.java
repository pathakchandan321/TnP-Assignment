package LinkedList;

import java.util.LinkedList;

class BuildLL{
    Node head=null;
    public Node insetAtBeginning(int data){

        if(head==null){
            head=new Node(data);
            return head;
        }
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        return head;
    }
    public Node insertAtLast(int data){
        if(head==null){
            head=new Node(data);
            return head;
        }
        Node newNode=new Node(data);
        Node temp=head;
        while (temp.next != null){
            temp=temp.next;
        }
        temp.next=newNode;
        return head;
    }
    public void test(){
        LinkedList<Integer> l=new LinkedList<>();
    }
    public void printNode(){
        if(head==null){
            return;
        }
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}
public class SingliLinkedList {
    public static void main(String[] args) {
       BuildLL obj=new BuildLL();
       obj.insetAtBeginning(5);
       obj.insetAtBeginning(4);
       obj.insetAtBeginning(3);
       obj.insetAtBeginning(2);
       obj.insetAtBeginning(1);
       obj.insertAtLast(6);
       obj.insertAtLast(7);
       obj.printNode();
    }
}
