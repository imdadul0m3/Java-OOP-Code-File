
class Man {
    String name;
    int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}

class Woman extends Man {
    String hairColor;

    public Woman(String name, int age, String hairColor) {
        super(name, age);
        this.hairColor = hairColor;
    }

    @Override
    public void speak() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old. I have " + hairColor + " hair.");
    }
}

public class Main {
    public static void main(String[] args) {
        Man man = new Man("John", 30);
        man.speak();

        Woman woman = new Woman("Jane", 25, "blonde");
        woman.speak();
    }
}
