public class WaterBottle {

    //define the instance variables
    private int volume;

    //constructor
    public WaterBottle(int volume) {
        this.volume = volume;
    }

    //getter method for volume
    public int getVolume() {
        return this.volume;
    }

    //drink method - reduces volume by 10
    public void drink() {
        this.volume -= 10;
    }

    //empty method - sets volume to 0
    public void empty() {
        this.volume = 0;
    }


    //fill method - sets volume to 100
    public void fill() {
        this.volume = 100;
    }


}
