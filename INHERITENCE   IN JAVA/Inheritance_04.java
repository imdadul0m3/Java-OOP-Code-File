
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
    }
}

class Man extends Person {
    private boolean isBearded;

    public Man(String name, int age, boolean isBearded) {
        super(name, age);
        this.isBearded = isBearded;
    }

    public void growBeard() {
        isBearded = false;
    }

    @Override
    public void introduce() {
        super.introduce();
        if (isBearded) {
            System.out.println("I have a beard.");
        } else {
            System.out.println("I'm clean-shaven.");
        }
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        person.introduce();

        Man man = new Man("Bob", 35, true);
        man.introduce();
        man.growBeard();
        man.introduce();
    }
}


