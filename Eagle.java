public class Eagle implements Flyable{
    @Override
    public void move(){
        System.out.println("Eagle walks on the ground.");
    }
    @Override
    public void fly(){
        System.out.println("Eagle soars high in the sky.");
    }
}
