// Illustrating static blocks in java
package staticblockspractice1;

public class StaticBlocksPractice1 {

    static{
        System.out.println("Block 1");
    }
    public static void main(String[] args) {
       System.out.println("main");
    }
    static{
        System.out.println("Block 2");
    }
    
}
