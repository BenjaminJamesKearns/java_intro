import static org.junit.Assert.*;
import org.junit.*;

public class JavaBuzzTest {

    public JavaBuzz javabuzz = new JavaBuzz();
    @Test
    public void returnsNumber() {
        String answer = javabuzz.number(1);
        assertEquals(answer, "1");
    }
    @Test
    public void returnsJava() {
        String answer = javabuzz.number(5);
        assertEquals(answer, "Buzz");
    }
    @Test
    public void returnsBuzz() {
        String answer = javabuzz.number(3);
        assertEquals(answer, "Java");
    }
    @Test
    public void returnsJavaBuzz() {
        String answer = javabuzz.number(15);
        assertEquals(answer, "JavaBuzz");
    }
}
