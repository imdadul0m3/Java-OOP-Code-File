
class Tree {
    public void grow() {
        System.out.println("The tree is growing.");
    }
}

class OakTree extends Tree {
    @Override
    public void grow() {
        System.out.println("The oak tree is growing slowly.");
    }
}

class PineTree extends Tree {
    @Override
    public void grow() {
        System.out.println("The pine tree is growing steadily.");
    }
}

public class PolymorphismTreeExample {
    public static void main(String[] args) {
        Tree tree1 = new Tree();
        Tree oakTree = new OakTree();
        Tree pineTree = new PineTree();

        tree1.grow();    
        oakTree.grow();  
        pineTree.grow(); 
    }
}







