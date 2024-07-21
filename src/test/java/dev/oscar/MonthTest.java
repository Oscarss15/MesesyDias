package dev.oscar;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MonthTest {

   
 

    @Test
    void testResultMonth() {
        assertEquals("The month is January and the month have 31 days.", Month.resultMonth(1));
        assertEquals("The month is February and the month have 28 days.", Month.resultMonth(2));
        assertEquals("The month is March and the month have 31 days.", Month.resultMonth(3));
        assertEquals("The month is April and the month have 30 days.", Month.resultMonth(4));
        assertEquals("The month is May and the month have 31 days.", Month.resultMonth(5));
        assertEquals("The month is June and the month have 30 days.", Month.resultMonth(6));
        assertEquals("The month is July and the month have 31 days.", Month.resultMonth(7));
        assertEquals("The month is August and the month have 31 days.", Month.resultMonth(8));
        assertEquals("The month is September and the month have 30 days.", Month.resultMonth(9));
        assertEquals("The month is October and the month have 31 days.", Month.resultMonth(10));
        assertEquals("The month is November and the month have 30 days.", Month.resultMonth(11));
        assertEquals("The month is December and the month have 31 days.", Month.resultMonth(12));
        assertEquals("The month is Invalid month and the month have 0 days.", Month.resultMonth(13));
        
    }
}
