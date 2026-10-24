import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Apptest {

    @Test
    public void testAddition() {
        assertEquals(5, App.add(2, 3));
    }
}