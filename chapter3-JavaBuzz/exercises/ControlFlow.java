import java.util.Scanner;
class OddOrEven {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("enter a number: ");
    int number = input.nextInt();
    if (number % 2 == 0) {
      System.out.println("you entered an even number");
    } else {
      System.out.println("you entered an odd number");
    };
  }
};
