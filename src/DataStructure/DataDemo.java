package DataStructure;

import java.util.ArrayList;

public class DataDemo {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();

    numbers.add((1));
    numbers.add((2));
    numbers.add((3));
    numbers.add((4));
    numbers.add((5));
    System.out.println(numbers);

    numbers.remove(3);
    System.out.println(numbers);

    System.out.println(numbers.get(3));

    ArrayList<Integer> arr = new ArrayList<>();
    ArrList<Integer> a = new ArrList<>();
    a.add(1);
    a.add(2);
    a.add(4);
    a.add(5);
    a.add(6);
    a.add(3,2);
    a.add(3,0);
    for(int i = 0; i < a.size(); ++i) {
      System.out.println(a.get(i));
    }
    a.removeLast();
    a.removeLast();
    a.removeLast();
    for(int i = 0; i < a.size(); ++i) {
      System.out.println(a.get(i));
    }
    a.remove(3);
    a.remove(1);
//    a.remove(1);
    a.remove(0);
    System.out.println("리무브");
    for(int i = 0; i < a.size(); ++i) {
      System.out.println(a.get(i));
    }
//    a.removeLast();
  }
}
