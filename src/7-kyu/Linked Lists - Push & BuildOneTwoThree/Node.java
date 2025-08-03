class Node {

    int data;
    Node next = null;

    Node(final int data) {
        this.data = data;
    }

    public Node(Node head, int data) {
        this.next = head;
        this.data = data;
    }

    public static Node push(final Node head, final int data) {
        return new Node(head, data);
    }

    public static Node buildOneTwoThree() {
        Node current = new Node(3);
        current = Node.push(current, 2);
        current = Node.push(current, 1);
        return current;
    }
}