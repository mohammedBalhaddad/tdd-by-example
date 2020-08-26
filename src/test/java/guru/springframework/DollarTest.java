package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class DollarTest {

    @Test
    void testDollarMultiplication(){
        // positive multiplication
        Dollar dollar = new Dollar(5);
        Dollar product = dollar.times(2);
        assertEquals(new Dollar(10) , product);

        // negative multiplication
        dollar = new Dollar(5);
        product = dollar.times(-2);
        assertEquals(new Dollar(-10) , product);

        // return new object , does not change the value ( Immutability )
        dollar = new Dollar(10);
        Dollar product_1 = dollar.times(3);
        assertEquals(new Dollar(30),product_1);
        Dollar product_2 = dollar.times(2);
        assertEquals(new Dollar(20),product_2);
    }

    @Test
    void testDollarEquality(){
        // Equality
        Dollar first = new Dollar(5);
        Dollar second = new Dollar(5);
        assertEquals(first,second);

        // Non-Equality
        first = new Dollar(5);
        second = new Dollar(10);
        assertNotEquals(first,second);

    }

}
