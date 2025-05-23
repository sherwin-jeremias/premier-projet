public class Calculatrice {

    public float add(float a, float b) {
        return a + b;
    }

    public float div(float a, float b) {
        if (b == 0.0f) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

    public float mult(float a, float b) {
        return a * b;
    }
}


//

public class Statistique {

    public Calculatrice calculatrice = new Calculatrice(); // Default dependency

    public float moyenne(float a, float b) {
        float sum = calculatrice.add(a, b);
        return calculatrice.div(sum, 2.0f);
    }
}


//

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Statistique {

    @Autowired
    public Calculatrice calculatrice;

    public float moyenne(float a, float b) {
        float sum = calculatrice.add(a, b);
        return calculatrice.div(sum, 2.0f);
    }
}
