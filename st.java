import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class StatistiqueTest {

    private Calculatrice mockCalc;
    private Statistique stats;

    @BeforeEach
    public void setUp() {
        mockCalc = mock(Calculatrice.class);
        stats = new Statistique();
        stats.calculatrice = mockCalc; // Manual injection
    }

    @Test
    public void testMoyenne() {
        when(mockCalc.add(4.0f, 2.0f)).thenReturn(6.0f);
        when(mockCalc.div(6.0f, 2.0f)).thenReturn(3.0f);

        assertEquals(3.0f, stats.moyenne(4.0f, 2.0f));
    }
}
