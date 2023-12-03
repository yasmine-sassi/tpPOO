package Arrayy;

public class CustomArrayList {
    private int[] elem;
    private int size;

    public CustomArrayList() {
        this.elem = new int[10];
        this.size = 0;
    }

    public CustomArrayList(int initialSize) {
        this.elem = new int[initialSize];
        this.size = 0;
    }

    public void add(int x) {
        if (size == elem.length) {
            int[] newElem = new int[elem.length * 2];
            for (int i = 0; i < size; i++) {
                newElem[i] = elem[i];
            }
            elem = newElem;
        }
        elem[size] = x;
        size++;
    }

    public void add(int index, int x) {
        if (index < 0 || index > size) {
            return;
        }

        if (size == elem.length) {
            int[] newElem = new int[elem.length * 2];
            for (int i = 0; i < size; i++) {
                newElem[i] = elem[i];
            }
            elem = newElem;
        }

        for (int i = size - 1; i >= index; i--) {
            elem[i + 1] = elem[i];
        }
        elem[index] = x;
        size++;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -10000;
        }
        return elem[index];
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int find(int x) {
        for (int i = 0; i < size; i++) {
            if (elem[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public void remove(int x) {
        int i = find(x);
        if (i != -1) {
            for (int j = i; j < size - 1; j++) {
                elem[j] = elem[j + 1];
            }
            size--;
        }
    }

    public void afficher() {
        for (int i = 0; i < elem.length; i++) {
            System.out.print(elem[i]);
            if (i < elem.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

