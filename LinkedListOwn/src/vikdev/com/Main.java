package vikdev.com;

public class Main {

    public static void main(String[] args) {
	List list = new List();
	list.insert(5);
        list.insert(52);
        list.insert(56);
        list.insertAtStart(2);
        list.insertAtIndex(2,14);
        list.remove(0);
	list.show();
    }
}
