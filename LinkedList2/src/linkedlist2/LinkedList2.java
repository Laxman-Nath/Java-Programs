// doubly linked list in java
package linkedlist2;
class Node{
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data=data;
    }
    
}
class Linkedlist{
    Node head=null;
    public void insert(Node item){
        if(head==null){
            head=item;
            head.next=null;
            head.prev=null;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=item;
            temp.next.next=null;
            temp.next.prev=temp;
        }
        }
    
    public void delete(int index){
        if(head==null){
            System.out.println("Linked list is empty");
        }
        else if(index==0){
            head=head.next;
//            head.prev=null;
        }
        else{
            Node temp=head;
            int count=0;
            while(temp!=null && count!=index-1){
                temp=temp.next;
                count++;
            }
            if(temp==null){
                System.out.println("It is larger index please give smaller index");
            }
            else if(temp.next.next==null){
                temp.next=null;
            }
            else {
                temp.next=temp.next.next;
                temp.next.next.prev=temp.next;
            }
        }
    }
    public void display(){
        Node temp=head;
        do{
            System.out.println(temp.data);
            temp=temp.next;
        }while(temp!=null);
    }
    }

public class LinkedList2 {
    public static void main(String[] args) {
        Node n1=new Node(23);
         Node n2=new Node(24);
         Node n3=new Node(25);
        Node n4=new Node(26);
        Node n5=new Node(27);
        Node n6=new Node(28);
        Linkedlist l1=new Linkedlist();
        l1.insert(n1);
        l1.insert(n2);
         l1.insert(n3);
         l1.insert(n4);
        l1.insert(n5);
        l1.insert(n6);
        l1.display();
        l1.delete(5);
        l1.display();
    }
    
}
