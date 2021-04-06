package week7;

public class Run_main {
    public static void main(String[] args) {
        linkedList myList = new linkedList();

        myList.add(10);
        myList.add(11);
        myList.add(12);
        myList.add(25);
        myList.tarverse();

        myList.remove(1);//remove node at index
        myList.tarverse();
        myList.remove(0);
        myList.tarverse();
    }
}
