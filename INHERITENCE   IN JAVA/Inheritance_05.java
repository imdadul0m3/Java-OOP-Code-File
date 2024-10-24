
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.eat();   
        dog.breathe(); 
        dog.bark();   
        dog.fetch();  

        Animal animal = dog; 
        animal.eat(); 
               
    }
}

class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Mammal extends Animal {
    public void breathe() {
        System.out.println("Mammal is breathing");
    }
}

class Dog extends Mammal {
    public void bark() {
        System.out.println("Dog is barking");
    }

    public void fetch() {
        System.out.println("Dog is fetching");
    }
}


