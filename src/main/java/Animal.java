public abstract class Animal {

    protected boolean hungry;

    protected int weight;

    protected String name;

    public Animal(boolean hungry, int weight, String name) {
        this.hungry = hungry;
        this.weight = weight;
        this.name = name;
    }

    public abstract boolean eat(Object food);
}
