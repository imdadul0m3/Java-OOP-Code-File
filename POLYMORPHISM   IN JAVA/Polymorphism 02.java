

class Animal02 {
    public int legs;
    public Animal02(int legs){
        this.legs = legs;
    }

    public void legNumber(){
        String name = getClass().getSimpleName();
        System.out.println("name : "+name+" leg number : "+legs);
    }

    public void sleep(){
        String name = getClass().getSimpleName();
        System.out.println(name+ " Sleeping...Don't distrub!");
    }
}

class Lion extends Animal02 {
    public Lion(int legs){
        super(legs);
    }
}

class Tiger extends Animal02 {
    public Tiger(int legs){
        super(legs);
    }
}

class Deer extends Animal02 {
    public Deer(int legs){
        super(legs);
    }
}

class MiniZoo{
    private Animal02[] animals;

    public MiniZoo(Animal02[] animals){
        this.animals = animals;
    }
    public void putThemOnSleep(){
        for(Animal02 animal02 : animals){
            animal02.sleep();
            animal02.legNumber();
        }
    }
}


public class Polymorphism02 {
    public static void main(String[] args) {
        Animal02[] animals = new Animal02[3];
        animals[0] = new Tiger(4);
        animals[1] = new Lion(4);
        animals[2] = new Deer(4);

        MiniZoo miniZoo = new MiniZoo(animals);
        miniZoo.putThemOnSleep();

    }
}






