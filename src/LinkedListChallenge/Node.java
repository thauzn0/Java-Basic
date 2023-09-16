package LinkedListChallenge;
public class Node {

    private int data;
    private Node next;
    private Node previous;


    public Node(int data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void printLinkedList(Node node) {
        while (node != null) {
            System.out.println(node.getData());
            node = node.getNext(); // Update node to the next node in the list
        }
    }

    public void removeFromFront(Node node){
        Node newNode = node;

        if(newNode.getPrevious() != null){
            newNode.setPrevious(null);
        }

        System.out.println(newNode.getPrevious());


    }



    public static void main(String[] args) {
        Node node = new Node(15);
        System.out.println(node.getData());
        System.out.println(node.getNext());
        node.setData(50);
        node.setNext(new Node(42));
        node.printLinkedList(node);
        System.out.println("-----------------------------");
        Node n1 = new Node(20);
        n1.setNext(new Node(25));
        n1.getNext().setNext(new Node(50));
        n1.getNext().getNext().setNext(new Node(60));

        node.printLinkedList(n1);
        System.out.println("----------------------");

        node.removeFromFront(n1);
        System.out.println("----------------------");
        node.printLinkedList(n1);

    }
}
