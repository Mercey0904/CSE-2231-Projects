import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class DateToDate1Test {

    private DateToDate1 calculator;

    @Before
    public void setUp() {
        this.calculator = new DateToDate1();
    }

    @Test
    public void testIsStartDateBeforeEndDate() {
        this.calculator.setStartDate(2022, 1, 1);
        this.calculator.setEndDate(2022, 1, 15);
        assertTrue(this.calculator.isStartDateBeforeEndDate());
    }

    @Test
    public void testIsStartDateBeforeEndDateFalse() {
        this.calculator.setEndDate(2022, 1, 1);
        this.calculator.setStartDate(2022, 1, 15);
        assertTrue(!this.calculator.isStartDateBeforeEndDate());
    }

    @Test
    public void testCalculateDaysBetween() {
        this.calculator.setStartDate(2022, 1, 1);
        this.calculator.setEndDate(2022, 1, 15);
        assertEquals(14, this.calculator.calculateDaysBetween());
    }

}
