// Singly Linked list in java
package linkedlist1;

class Node{
    int data;
    Node next;

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
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=item;
            temp.next.next=null;
        }
    }
    public void deleteatend(){
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    
    public void deleteatfirst(){
        head=head.next;
    }
    
    public void deleteatspecifiedpos(int index){
       if(head==null){
           return;
       }
    else   if(index==0){
           head=head.next;
           }
    else{
   Node temp=head;  
   int count=0;
    while(count!=index-1 && temp!=null){
        temp=temp.next;
        count++;
} 
if(temp==null){
return;
}
else{
  temp.next=temp.next.next;
    
    
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
public class LinkedList1 {

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
        l1.deleteatspecifiedpos(0);
        l1.display();
    }
    
}
