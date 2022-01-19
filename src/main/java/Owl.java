import java.util.Random;

public class Owl {

    private int wingSpan;

    private  boolean hungry;

    private double weight;

    private String name;

    //constructor
    public Owl(int wingSpan, boolean hungry, double weight, String name) {
        this.wingSpan = wingSpan;
        this.hungry = hungry;
        this.weight = weight;
        this.name = name;
    }

    private static final int DEFAULT_WINGSPAN = 90;
    private static final int DEFAULT_WEIGHT = 3000;

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        if(wingSpan >=75 && wingSpan <= 110) {
            this.wingSpan = wingSpan;
        }else{
            this.wingSpan = DEFAULT_WINGSPAN;
        }
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight >= 2000 && weight <= 4000) {
            this.weight = weight;
        }else {
            this.weight = DEFAULT_WEIGHT;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean eat(PineTree pineTree){
        Random random = new Random();
        int squirrelSpeed = random.nextInt(11);
        int owlSpeed = random.nextInt(11);
        return hungry && owlSpeed > squirrelSpeed;
    }
}
