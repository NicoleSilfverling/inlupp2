import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Squirrel> squirrels = new ArrayList<>();

        squirrels.add(new Squirrel(300, 5, 2, "Bob", true));
        squirrels.add(new Squirrel(400, 3, 3, "Bobby", true));

        Owl owl = new Owl(85, true, 3500,"Magnus");

        PineTree pineTree = new PineTree(12, squirrels, owl, 650);



        System.out.println(owl.eat(pineTree) ? "Nom nom nom, " + owl.getName() + " the owl stole the squirrels pine cone" : "The squirrel was too fast, no food for " + owl.getName());


        System.out.println(pineTree.fall(40, 700, 5) ? "The tree fell" : "The tree survived");



        if (squirrels.get(0).eat(pineTree)){
            System.out.println(squirrels.get(0).getName() + " the squirrel has eaten");
        }else {
            System.out.println("No food for " + squirrels.get(0).getName());
        }


        boolean pineTreeFell = pineTree.fall(40, 700, 5);
        System.out.println("Did the tree fall? " + pineTreeFell);





    }
}
