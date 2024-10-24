
// superclass
class Animal001{
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}
// subclass
class Cat001 extends Animal001 {
    @Override
    public void makeSound() {

        System.out.println("Meow");
    }
}

// subclass
class Dog001 extends Animal001 {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}


public class polymorphism01 {
    public static void main(String[] args) {
        Animal001 animal1 = new Cat001();
        Animal001 animal2 = new Dog001();
        Animal001 animal3 = new Animal001();
        animal3.makeSound();
        animal1.makeSound();
        animal2.makeSound();
    }
}