package DataStructure;

public class LinkedListTest {
  public static void main(String[] args) {
    SLinkedList list = new SLinkedList();
    Node<Integer> node = new Node<>(10);
    Node<Integer> node1 = new Node<>(20);
    Node<Integer> node2 = new Node<>(30);
    Node<Integer> node3 = new Node<>(40);

    list.add(node);
    list.add(node1);
    list.add(node2);
    list.add(node3);

    System.out.println(list.getNowNode().getNext().getItem());
  }
}
