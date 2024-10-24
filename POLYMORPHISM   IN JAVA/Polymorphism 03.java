

public class Run{
    public static void main(String[] args){

        Favorite_Fruit fftt = new Favorite_Fruit();
        Kamal_Favorite_Fruit fruit;

        fruit = new Kamal_Favorite_Fruit("Banana");
        fftt.print01(fruit);
        System.out.println(fruit.favorite_Fruit_name());

        fruit = new Jamal_Favorite_Fruit("Mango");
        fftt.print01(fruit);
        System.out.println(fruit.favorite_Fruit_name());

    }
}


class Favorite_Fruit{
    void print01(Kamal_Favorite_Fruit fft){
        System.out.println(fft.favorite_Fruit_name());
    }
}


class Kamal_Favorite_Fruit{
    String fruit_name;

    public Kamal_Favorite_Fruit(String name){
        fruit_name = name;
    }

    String favorite_Fruit_name(){
        return fruit_name;
    }
}


class Jamal_Favorite_Fruit extends Kamal_Favorite_Fruit{
    public Jamal_Favorite_Fruit(String name){
        super(name);
    }

    @Override
    String favorite_Fruit_name(){
        return fruit_name;
    }
}



