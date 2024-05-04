import kit.org.Main;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AppTest {
    @Test
    public void testCountUnique() {
        long actual = Main.countUnique("test.txt");
        long expect = 4L;
        assertThat(actual).isEqualTo(expect);
    }
}
