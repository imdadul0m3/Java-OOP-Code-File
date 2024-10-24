
class Teacher {
    private String name;
    private int age;
    private String subject;

    public Teacher(String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSubject() {
        return subject;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }else {
            System.out.println("Age cannot be negative.");
        }
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ". I'm " + age + " years old and I teach " + subject + ".");
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Ms. Smith", 35, "Math");
        
        teacher.introduce();

        // Using getter and setter methods
        teacher.setName("Mrs. Johnson");
        teacher.setAge(40);
        teacher.setSubject("Science");

        teacher.introduce();
    }
}
