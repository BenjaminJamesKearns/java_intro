class FizzBuzz {
  public static void main(String[] args) {
    Integer[] numbers = new Integer[100];
    for(int i=0;i<100;i++) {
      numbers[i] = i + 1;
    }
    for(int num: numbers) {
      if (num%15==0) {
        System.out.println("JavaBuzz");
      } else if(num%5==0) {
        System.out.println("Buzz");
      } else if(num%3==0) {
        System.out.println("Java");
      } else {
        System.out.println(num);
      }
    }
  }
};
