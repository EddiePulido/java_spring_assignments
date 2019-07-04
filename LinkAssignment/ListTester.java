public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(13);
        sll.add(124);
        sll.add(10);
        sll.add(500);
        sll.add(135);
        sll.add(22);


        System.out.println("Second Max: " + sll.secondMax().value);
        sll.printValues();
    }
}