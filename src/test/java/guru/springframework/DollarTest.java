package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class DollarTest {

    @Test
    void testDollarMultiplication(){
        // positive multiplication
        Money dollar = Dollar.dollar(5);
        Money product = dollar.times(2);
        assertEquals(Dollar.dollar(10) , product);

        // negative multiplication
        dollar = Dollar.dollar(5);
        product = dollar.times(-2);
        assertEquals(Dollar.dollar(-10) , product);

        // return new object , does not change the value ( Immutability )
        dollar = Dollar.dollar(10);
        Money product_1 = dollar.times(3);
        assertEquals(Dollar.dollar(30),product_1);
        Money product_2 = dollar.times(2);
        assertEquals(Dollar.dollar(20),product_2);
    }

    @Test
    void testDollarEquality(){
        // Equality
        Money first = Dollar.dollar(5);
        Money second = Dollar.dollar(5);
        assertEquals(first,second);

        // Non-Equality
        first = Dollar.dollar(5);
        second = Dollar.dollar(10);
        assertNotEquals(first,second);

    }

    @Test
    void testDollarCurrency(){
        Money dollar = Money.dollar(10);
        assertEquals("USD",dollar.currency());
    }

}
