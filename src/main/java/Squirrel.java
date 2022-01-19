public class Squirrel extends Animal {

    private int numOfConesInNest;

    private int age;


    //constructor
    public Squirrel(int weight, int numOfConesInNest, int age, String name, boolean hungry) {
        super(hungry, weight, name);
        this.numOfConesInNest = numOfConesInNest;
        this.age = age;
    }


    private static final int DEFAULT_WEIGHT = 300;


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight >= 200 && weight <= 450) {
            this.weight = weight;
        }else {
            this.weight = DEFAULT_WEIGHT;
        }
    }

    public int getNumOfConesInNest() {
        return numOfConesInNest;
    }

    public void setNumOfConesInNest(int numOfConesInNest) {
        this.numOfConesInNest = numOfConesInNest;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }


    public boolean eat(PineTree pineTree){
        if(hungry && (numOfConesInNest > 0 || pineTree.getNumOfCones() > 0)){
            setWeight(getWeight() + 10);
            return true;
        }
        return false;
    }

    @Override
    public boolean eat(Object food) {
        return food instanceof PineTree.PineCone;
    }

}
