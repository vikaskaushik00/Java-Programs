package vikdev.com;

public class Main {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.insert(5);
        linkedList.insert(15);
        linkedList.insert(25);
        linkedList.insert(35);
        linkedList.insertAtStart(3);
        linkedList.insertAtIndex(1,55);
        linkedList.delete(2);
        linkedList.show();

    }
}
