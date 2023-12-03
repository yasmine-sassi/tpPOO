public class MallardDuck extends Duck implements Flyable{
    private Flyable fb;
    private Quackable qb;
    public MallardDuck(String name,Flyable fb,Quackable qb) {
        super(name);
        this.fb=fb;
        this.qb=qb;
    }
    public Quackable getQb() {
        return qb;
    }
    public Flyable getFb() {
        return fb;
    }
    public void display() {
        System.out.println("I am a mallard duck named "+this.getName()+" my behaviours: ");
        fb.fly();
        qb.quack();
    }
    public void fly() {
        System.out.println("I am a flying mallard duck");
    }
}
