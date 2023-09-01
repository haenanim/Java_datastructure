package Hashtable;

public class Chaining<K,V> {
  private int M = 13;
  private Node[] a = new Node[M];

  public static class Node{
    private Object key;
    private Object data;
    private Node next;
    public Node(Object key, Object data, Node next){
      this.key = key;
      this.data = data;
      this.next = next;
    }

    public Object getKey() {
      return key;
    }

    public Object getData() {
      return data;
    }
  }

  private int hash(K key){
    return (key.hashCode()& 0x7fffffff) % M;
  }
  public V get(K key) {
    int index = hash(key);
    for(Node x = a[index]; x != null ; x = x.next) {
      if(x.key.equals(key)) {
        return (V)x.data;
      }
    }
    return null;
  }
  public void put(K key, V data){
    int index = hash(key);
    for(Node x = a[index]; x != null ; x = x.next) {
      if(x.key.equals(key)) {
        x.data = data;
        return;
      }
    }
    a[index] = new Node(key, data, a[index]);
  }

  public String toString() {
    String str = "";
    for(int i = 0 ; i < a.length; ++i) {
      str += i;
      for(Node x = a[i] ; x != null; x = x.next){
        str += "-->[" + x.key + "," + x.data + "]";
      }
      str += "\n";
    }
    return str;
  }
}
