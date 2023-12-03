public class StackTest {
    public static void main(String[] args) {
        CustomStack customStack = new CustomStack(3);
        customStack.addElement(10);
        customStack.addElement(20);
        customStack.addElement(30);
        System.out.println("Is the stack empty? " + customStack.stackIsEmpty());
        customStack.addElement(40);
        customStack.removeElement();
        System.out.println("Last in stack: " + customStack.lastInStack());
        System.out.println("Is the stack full?"+customStack.stackIsFull());
    }
}
