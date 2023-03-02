import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MavenTest {
    @Test
    void whenAdditionthenYolo(){
        int i = 5;
        int j = 10;
        int result = Maven.addition(i, j);
        assertEquals(i+j,result);



    }
}
