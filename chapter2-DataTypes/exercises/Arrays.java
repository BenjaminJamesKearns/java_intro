import java.util.ArrayList;
class Arrays {
  public static void main(String[] args) {
    String[] strings = {"one", "two", "three"};
    for(int i = 0; i<strings.length; i++) {
      System.out.println(strings[i]);
    }
    Integer[] integers = {1, 2, 3};
    for (int i = 0; i < integers.length; i++) {
      System.out.println(integers[i]);
    }
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(3);
    numbers.add(2);
    numbers.add(1);
    for (int i = 0; i < numbers.size(); i++) {
      System.out.println(numbers.get(i));
    }
  }
};
