import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Moveable> moveableBirds = new ArrayList<>();
        moveableBirds.add(new Penguin());
        moveableBirds.add(new Ostrich());
        moveableBirds.add(new Sparrow());
        moveableBirds.add(new Eagle());

        System.out.println("=== All birds moving ===");
        for (Moveable bird : moveableBirds) {
            bird.move();
        }
        List<Flyable> flyingBirds = new ArrayList<>();
        flyingBirds.add(new Sparrow());
        flyingBirds.add(new Eagle());

        System.out.println("\n=== Flying birds flying ===");
        for (Flyable bird : flyingBirds) {
            bird.fly();
        }
        System.out.println("\n=== Using Flyable as Moveable ===");
        Moveable m = new Eagle();
        m.move();
    }
}