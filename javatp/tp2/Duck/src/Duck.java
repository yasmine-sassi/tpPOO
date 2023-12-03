public class Duck {
    protected String name;
    public Duck(String name){this.name=name;}
    public String getName(){return name;}
    public void display(){
        System.out.println("I am a duck");
    }
    public void swim(){
        System.out.println("I am swimming");
    }
}
