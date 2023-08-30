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
  }
}
