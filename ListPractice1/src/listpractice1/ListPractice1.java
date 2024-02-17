// ArrayList in java collection

package listpractice1;
import java.util.*;


public class ListPractice1 {

    public static void main(String[] args) {
        ArrayList<Integer> al1=new ArrayList<>(20);// Creatig arralist of integer type with size 20
         ArrayList<Integer> al2=new ArrayList<>(List.of(5,6,7,8));// Creating arraylist with element
        al1.add(19);// adding 19 into the list
        al1.add(0,10);
        al1.add(2,100);
          al1.add(200);
        //        al1.addAll(al2);
  al1.addAll(1,al2);
          al1.add(19);
       //          al2.clear(); // delete all element from al2
//         System.out.println(al1.contains(100)); // Search for al1 with in the list and returns true or false
 //System.out.println(al1.get(2));
//System.out.println( al1.containsAll(al2)) ; // search for all elements of al2 inside list al1 and returns true or false
//System.out.println(al1.indexOf(19)); // start searching from front side
//System.out.println(al1.lastIndexOf(19));// start searching from backside
//al1.set(0, 1000); // replace element at index 0 by 1000
//al1.retainAll(al2); // element of al2 will only remain in al2
//al1.remove(0);  // remove element from index 0
//al1.removeAll(al2); // remove all elements of al2 from al1
//       System.out.println(al2);
//        System.out.println(al1);

//for(int i=0;i<al1.size();i++){
//    System.out.println(al1.get(i));
//}

//     for(var a:al1){
//         System.out.println(a);
//     }

//     Iterator<Integer> il1=al1.iterator();
//     while(il1.hasNext()){
//         System.out.println(il1.next());
//     }

//ListIterator<Integer> il1=al1.listIterator();
//     while(il1.hasNext()){
//         System.out.println(il1.next());
//     }

 al1.forEach(n->System.out.println(n));
    }
    
}
