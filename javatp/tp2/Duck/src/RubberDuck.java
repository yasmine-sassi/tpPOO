public class RubberDuck extends Duck implements Quackable{

    public RubberDuck(String name) {
        super(name);
    }
    public void display(){
        System.out.println("I am a rubber duck named "+this.getName());
    }
    public void quack() {
        System.out.println("I am a quacking rubber duck");
    }
}
