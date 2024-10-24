

public class Main{
    public static void main(String[] ags){

        Teacher teacher = new Teacher("John Doe", 25, "Math");

        System.out.println("The teacher's name is "+teacher.getName());
        System.out.println("The teacher's age is "+teacher.getAge());
        System.out.println("The teacher's subject is "+teacher.getSubject());


        try{
            teacher.setName("komoldiren");
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try{
            teacher.setAge(18);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try{
            teacher.setSubject("English");
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());

        }

         System.out.println(teacher.getName());
         System.out.println(teacher.getAge());
         System.out.println(teacher.getSubject());
    }
}


class Teacher{
    private String name;
    private int age;
    private String subject;

    public Teacher(String name, int age, String subject){
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if(name.length() < 3){
            throw new IllegalArgumentException("The name must be at least 3 characters long.");
        }
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age < 18){
            throw new IllegalArgumentException("the age must be at least 18.");
        }
        this.age = age;
    }

    public String getSubject(){
        return subject;
    }

    public void setSubject(String subject){
        if(subject.length() < 5){
            throw new IllegalArgumentException("The subject must e at least 5 characters log"); 
        }
        this.subject = subject;
    }
}





