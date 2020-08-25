package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class MoneyTest {

    @Test
    void testDollarMultiplication(){
        // positive multiplication
        Dollar dollar = new Dollar(5);
        Dollar product = dollar.times(2);
        assertEquals(10 , product.amount);

        // negative multiplication
        dollar = new Dollar(5);
        product = dollar.times(-2);
        assertEquals(-10 , product.amount);

        // return new object , does not change the value ( Immutability )
        dollar = new Dollar(10);
        Dollar product_1 = dollar.times(3);
        assertEquals(30,product_1.amount);
        Dollar product_2 = dollar.times(2);
        assertEquals(20,product_2.amount);
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
