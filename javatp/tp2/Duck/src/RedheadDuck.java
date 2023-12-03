public class RedheadDuck extends Duck implements Flyable,Quackable{

    public RedheadDuck(String name) {
        super(name);
    }
    public void display() {
        System.out.println("I am a redhead duck named "+this.getName());
    }

    @Override
    public void fly() {
        System.out.println("i am a flying redhead duck");
    }

    @Override
    public void quack() {
        System.out.println("I am a quacking redhead duck");
    }
}
