

public class Encapsulation{
    public static void main(String[] ags){

        Person alice = new Person("Alice", 20);
        
        System.out.println(alice.getAge());
        System.out.println(alice.getName());

        alice.setAge(34);
        alice.setName("imdadul");

        System.out.println(alice.getAge());
        System.out.println(alice.getName());
      
    }
}


class Person{
    private String name;
    private int age;
    int roll = 25;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}




