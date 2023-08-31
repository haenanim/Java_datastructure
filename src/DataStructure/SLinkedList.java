package DataStructure;

import java.util.Iterator;

public class SLinkedList implements Iterator {
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
    } else {
      node.setPrev(this.tail);
      this.tail.setNext(node);
      this.tail = node;
    }
    size++;
  }

  public Node getNode(int index) {
    Node x = head;
    for(int i = 0; i < index ; ++i) {
      x = x.getNext();

    }
    return x;
  }
  public void add(int index, Node newNode) {
    if(index == 0) {
      add(newNode);
    } else {
      Node prevNode = getNode(index -1);
      newNode.setNext(prevNode.getNext());
      prevNode.setNext(newNode);
      size++;
    }
    if(newNode.getNext() == null) {
      tail = newNode;
    }
  }
  public Node getNowNode() {
    return iterator;
  }

  public int getSize() {
    return size;
  }
  @Override
  public String toString() {
    String str = "";
    Node x = head;
    for(int i = 0 ; i < size; ++i) {
      str += x.getItem();
      if(i != size-1) {
        str += ", ";
      }
      x = head.getNext();
    }
    return str;
  }
  @Override
  public boolean hasNext() {
    if(iterator == null) {
      iterator = this.head;
      return true;
    }else if(iterator.getNext() == null) {
      iterator = this.head;
      return false;
    }
    iterator = iterator.getNext();
    return true;
  }

  @Override
  public Node next() {
    if(iterator == null) {
      iterator = this.head;
      return iterator;
    }else if(iterator.getNext() == null) {
      iterator = this.head;
      return null;
    }
    iterator = iterator.getNext();
    return iterator;
  }
}
