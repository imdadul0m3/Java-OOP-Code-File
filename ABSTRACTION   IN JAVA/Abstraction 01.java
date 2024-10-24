

abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println( name+ " barks.");
    }
}


public class Abstraction02 {
public static void main(String[] args){

    Animal animal = new Dog("dog");
    animal.sleep();
    animal.makeSound();

    }
}








