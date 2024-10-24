

public class Inheritence01{
    public static void main(String[] args){

        Bicycle mb = new MountainBike();
        mb.setGear(4);
        mb.setGear(5);
        mb.readGear();
        mb.setCadence(15);
        mb.readCadence();
        mb.speedUp(34);
        mb.applyBrake(12);
        mb.readSpeed();
        MountainBike mab = new MountainBike();
        mab.setHeight(43);
        mab.readHeight();


    }
}


class Bicycle{

    public int cadence;
    public int gear;
    public int speed;

    public void setCadence(int newValue){
        cadence = newValue;
    }
    public void readCadence(){
        System.out.println(cadence);
    }
    public void setGear(int newValue){
        gear = newValue;
    }
    public void readGear(){
        System.out.println(gear);
    }
    public void applyBrake(int decrement){
        speed -= decrement;
    }
    public void speedUp(int increment){
        speed += increment;
    }
    public void readSpeed(){
        System.out.println(speed);
    }
    
}


class MountainBike extends Bicycle{

    public int seatHeight;
    public void setHeight(int newValue){
        seatHeight = newValue;  
}
public void readHeight(){
        System.out.println(seatHeight);
    }

}





