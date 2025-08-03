
class Node {
    public Object data;
    public Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this(data, null);
    }
}

public class Solution {
    static int indexOf(Node head, Object value) {
        int start = 0;
        while(head != null) {
            if(head.data == value) {
                return start;
            }

            start++;
            head = head.next;
        }

        return -1;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        n1.next = new Node(2);
        n1.next.next = new Node(3);
        n1.next.next.next = new Node(3);

        System.out.println(indexOf(n1, 3));
        System.out.println(indexOf(n1, 1));
        System.out.println(indexOf(n1, 4));
    }
}