import java.util.Stack;

public class CustomStack {
    private int[] stk;
    private int capacity,size;
    private int ls=-1;

    public CustomStack(int capacity) {
        this.stk = new int[capacity];
        this.capacity = capacity;
        this.size = 0;
    }
    public void addElement(int element) {
        if (!stackIsFull()) {
            if(stackIsEmpty()){ls=element;}
            stk[size]=element;
            size++;
        } else {
            System.out.println("full");
        }
    }
    public void removeElement() {
        if (!stackIsEmpty()) {
            if(size==1){
                ls=-1;
            }
            size--;
        } else {
            System.out.println("empty");
        }
    }
    public int lastInStack() {
        if (!stackIsEmpty()) {
            return ls;
        } else {
            return -1;
        }
    }
    public boolean stackIsEmpty() {
        return (size==0);
    }
    public boolean stackIsFull() {
        return (size==capacity);
    }
}
