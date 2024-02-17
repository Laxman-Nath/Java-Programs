// Implementing  queue using queue in java
package queue1;
import java.util.Scanner;
class queue{
    int front=-1;
    int rear=-1;
    void delete(int queue[]){
        if(front==-1 && rear==-1){
            System.out.println("Queue is empty");
        }
        else
           System.out.println("Deleted element is:"+queue[front++]);
        }
        void insert(int queue[],int item){
            if(rear==queue.length-1){
                System.out.println("Queue is fulll");
            }
            else if(front==-1 && rear==-1){
                queue[++rear]=item;
                ++front;
            }
            else {
                queue[++rear]=item;
            }
        }
        void display(int queue[]){
            if(front>-1 && rear<queue.length){
                for(int i=front;i<=rear;i++){
                                    System.out.println(queue[i]);
                }

            }
            else{
                System.out.println("Queue is empty");
            }
        }
    }
    


public class Queue1 {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
           int size;
          System.out.println("Enter size of queue:");
        size=sc.nextInt();
        int queue[]=new int[size];
        queue s=new queue();
        int choice;
     
      do{
          System.out.println("/********************************************************************");
          System.out.println("1.Insert element into the queue");
          System.out.println("2.Delete element from queue");
          System.out.println("3.Display all element of queue");
          System.out.println("4.Exit");
          System.out.println("***********************************************************************/");
          System.out.println("Enter your choice");
          choice=sc.nextInt();
          switch (choice) {
              case 1:
                  int item;
                  System.out.println("Enter element to be inserted:");
                  item=sc.nextInt();
                  s.insert(queue, item);
                 break;
              case 2:
                  s.delete(queue);
                  break;
              case 3:
                  s.display(queue);
                  break;
              
          }
      }while(choice!=4);
    }
    
}
