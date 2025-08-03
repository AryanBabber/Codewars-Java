
// This will be given
class Node {
    public int data;
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
    static int length(Node head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }

        return len;
    }
}