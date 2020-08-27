package guru.springframework;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class FrancTest {


    @Test
    void testFrancMultiplication(){
        // positive Multiplication
        Money franc =  Money.franc(5);
        Money product = franc.times(2);
        assertEquals( Money.franc(10),product);

        // negative multiplication
        franc = Money.franc(5);
        product = franc.times(-2);
        assertEquals(Money.franc(-10), product);

        // return new object , does not change the value of amount ( Immutability )
        franc =  Money.franc(10);
        Money product_1 = franc.times(3);
        assertEquals( Money.franc(30),product_1);
        Money product_2 = franc.times(2);
        assertEquals( Money.franc(20),product_2);

    }

    @Test
    void testFrancEquality(){
        // Equality
        Money franc_1 =  Money.franc(5);
        Money franc_2 =  Money.franc(5);
        assertEquals(franc_1,franc_2);

        // Non-Equality
        franc_1 =  Money.franc(5);
        franc_2 = Money.franc(10);
        assertNotEquals(franc_1,franc_2);
    }

    @Test
    void testFrancCurrency(){
        Money franc = Money.franc(5);
        assertEquals("CHF",franc.currency());
    }

}
