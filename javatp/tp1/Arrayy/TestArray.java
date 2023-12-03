package Arrayy;

public class TestArray {
    public static void main(String[]args){
        CustomArrayList arr= new CustomArrayList();
        for(int i=0;i<10;i++){
            arr.add(i);
        }
        arr.afficher();
        arr.remove(2);
        arr.add(0,2);
        System.out.println(arr.find(8));
        arr.afficher();
    }
}
