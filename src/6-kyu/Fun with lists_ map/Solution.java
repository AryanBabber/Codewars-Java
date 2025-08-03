import java.util.function.Function;

class Node<T> {
  T data;
  Node<T> next;

  Node(T data, Node next) {
    this.data = data;
    this.next = next;
  }
}

public class Solution {
  static <T, R> Node<R> map(Node<T> head, Function<T, R> f) {
    if (head == null)
      return null;
    Node<R> newHead = new Node<>(f.apply(head.data), null);
    Node<R> current = newHead;
    head = head.next;

    while (head != null) {
      current.next = new Node<>(f.apply(head.data), null);
      current = current.next;
      head = head.next;
    }

    return newHead;
  }

  public static void main(String[] args) {
    Node<Integer> node = map(new Node<Integer>(1, new Node<Integer>(2, new Node<Integer>(3, null))), x -> x * 2);

    while(node != null) {
      System.out.print(node.data + "->");
      node = node.next;
    }
    System.out.println("null");
  }
}