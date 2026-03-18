package LinkedList;

import java.util.List;

class LinkedList{
    Node2 head=null;
    public Node2 insetAtFirst(int data){
        if(head==null){
            head=new Node2(data);
            return head;
        }
        Node2 newNode=new Node2(data);
        newNode.next=head;
        head=newNode;
        return head;
    }
    public Node2 insertAtLast(int data){
        if(head==null){
            head=new Node2(data);
            return head;
        }
        Node2 newNode=new Node2(data);
        Node2 temp=head;
        while (temp.next != null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
        return head;
    }
    public void printLL(){
        if (head==null){
            return;
        }
        Node2 temp=head;
        while (temp != null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void test(){
        List<Integer> l=new java.util.LinkedList<>();
    }
}
public class DoublyLinkedList {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.insetAtFirst(4);
        l.insetAtFirst(3);
        l.insetAtFirst(2);
        l.insetAtFirst(1);
        l.insertAtLast(5);
        l.printLL();
    }
}
