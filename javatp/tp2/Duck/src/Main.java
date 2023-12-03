public class Main {
    public static void main(String[] args) {
        fly1 fb1=new fly1();
        fly2 fb2=new fly2();
        quack1 qb1=new quack1();
        quack2 qb2=new quack2();
        MallardDuck md= new MallardDuck("batta",fb1,qb2);
        md.display();
        md.getQb().quack();
        MallardDuck md1= new MallardDuck("batta1",fb2,qb1);
        md1.display();
        md1.getFb().fly();
        RubberDuck rd=new RubberDuck("batta rubber");
        Duck redd= new RedheadDuck("batta hamra");
        rd.display();
        rd.quack();
        rd.swim();
        redd.display();
    }
}