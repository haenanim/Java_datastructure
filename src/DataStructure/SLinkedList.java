package DataStructure;

import java.util.Iterator;

public class SLinkedList  {
  private Node head;
  private Node tail;
  private Node iterator;
  private int size;
  public SLinkedList() {
    this.head = null;
    this.tail = null;
    this.size = 0;
  }

  public void add(Node node) {
    if(size == 0) {
      this.head = node;
      this.tail = node;
      this.iterator = node;
    } else {
      this.tail.setNext(node);
      this.tail = node;
    }
    size++;
  }
  public Node getNowNode() {
    return iterator;
  }

}
