import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class StatistiqueMockBeanTest {

    @MockBean
    private Calculatrice mockCalc;

    @Autowired
    private Statistique stats;

    @Test
    public void testMoyenne() {
        when(mockCalc.add(4.0f, 2.0f)).thenReturn(6.0f);
        when(mockCalc.div(6.0f, 2.0f)).thenReturn(3.0f);

        assertEquals(3.0f, stats.moyenne(4.0f, 2.0f));
    }
}
