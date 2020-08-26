package guru.springframework;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class FrancTest {


    @Test
    void testFrancMultiplication(){
        // positive Multiplication
        Franc franc = new Franc(5);
        Franc product = franc.times(2);
        assertEquals(new Franc(10),product);

        // negative multiplication
        franc = new Franc(5);
        product = franc.times(-2);
        assertEquals(new Franc(-10), product);

        // return new object , does not change the value of amount ( Immutability )
        franc = new Franc(10);
        Franc product_1 = franc.times(3);
        assertEquals(new Franc(30),product_1);
        Franc product_2 = franc.times(2);
        assertEquals(new Franc(20),product_2);

    }

    @Test
    void testFrancEquality(){
        // Equality
        Franc franc_1 = new Franc(5);
        Franc franc_2 = new Franc(5);
        assertEquals(franc_1,franc_2);

        // Non-Equality
        franc_1 = new Franc(5);
        franc_2 = new Franc(10);
        assertNotEquals(franc_1,franc_2);
    }
}
