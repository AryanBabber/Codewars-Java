public class Node {

    int data;
    Node next = null;

    Node(final int data) {
        this.data = data;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public static Node append(Node listA, Node listB) {
        if (listA == null)
            return listB;
        if (listB == null)
            return listA;

        Node temp = listA;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = listB;

        return listA;
    }

    private static void print(Node root) {
        System.out.print("START -> ");
        while(root != null) {
            System.out.print(root.data + " -> ");
            root = root.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        n1.next = new Node(2);
        Node n2 = new Node(3);
        n2.next = new Node(4);
        // n1.next = new Node(5);

        print(append(n1, n2));
    }
}