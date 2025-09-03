public class Sparrow implements Flyable{
    @Override
    public void move(){
        System.out.println("Sparrow hops and walks.");
    }
    @Override
    public void fly(){
        System.out.println("Sparrow flies through the sky.");
    }
}
