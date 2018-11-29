import static org.junit.Assert.*;
import org.junit.Test;;

public class JavaBuzzTest {

    @Test
    public void returnsNumber() {
        JavaBuzz javabuzz = new JavaBuzz();
        int answer = javabuzz.number(1);
        assertEquals(answer, 1);
    }
}
