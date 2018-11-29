public class JavaBuzz {
    public String number(int num) {
        if (num%3==0 || num%5==0) {
            return returnString(num);
        } else {
            return returnNum(num);
        }
    }
    private String returnNum(int num) {
        return Integer.toString(num);
    }
    private String returnString(int num) {
        if (num%15==0) {
            return "JavaBuzz";
        } else if(num%5==0) {
            return "Buzz";
        } else {
            return "Java";
        }
    }
}