class Node {
    public int data;
    public Node next = null;

    public static int getNth(Node n, int index) throws Exception {
        int pos = 0;

        while (n != null) {
            if (pos == index)
                return n.data;
            pos++;
            n = n.next;
        }

        throw new ArithmeticException("Index out of bounds.");
    }
}