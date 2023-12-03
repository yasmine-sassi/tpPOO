public class DecoyDuck extends Duck{
    public DecoyDuck(String name) {
        super(name);
    }
    public void display() {

        System.out.println("I am a decoy duck named "+this.getName());
    }
}
