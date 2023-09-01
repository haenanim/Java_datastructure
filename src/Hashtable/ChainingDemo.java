package Hashtable;

public class ChainingDemo {
  public static void main(String[] args) {
    Chaining<Integer, String> c = new Chaining<>();
    c.put(10, "A");
    c.put(23, "B");
    c.put(36, "C");

    System.out.println(c.get(36));

  }
}
