import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import components.map.Map;

public class DateToDateSecondaryTest {

    private DateToDateSecondary dateCalculator;

    @Before
    public void setUp() {
        // For testing purposes,I use a concrete class that extends DateToDateSecondary
        this.dateCalculator = new DateToDateSecondary() {
            // Implement abstract methods for testing
            @Override
            public int calculateDaysBetween() {
                return 10;
            }

            @Override
            public String getStartDate() {
                return "2024-01-01";
            }

            @Override
            public String getEndDate() {
                return "2024-01-10";
            }

            @Override
            public void setStartDate(int year, int month, int day) {
            }

            @Override
            public void setEndDate(int year, int month, int day) {
            }

            @Override
            public boolean isStartDateBeforeEndDate() {
                return false;
            }

            @Override
            public String getEvent() {
                // TODO Auto-generated method stub
                return null;
            }

            @Override
            public Object newInstance() {
                return null;
            }

            @Override
            public void transferFrom(Object source) {

            }

            @Override
            public void clear() {

            }
        };
    }

    @Test
    public void testCalculateWeeksBetween() {
        assertEquals(1, this.dateCalculator.calculateWeeksBetween());
    }

    @Test
    public void testCalculateMonthsBetween() {
        assertEquals(0, this.dateCalculator.calculateMonthsBetween());
    }

    @Test
    public void testCalculateYearsBetween() {
        assertEquals(0, this.dateCalculator.calculateYearsBetween());
    }

    @Test
    public void testGenerateEventCountdownMap() {
        int expectedDays = this.dateCalculator.calculateDaysBetween();
        Map<String, Integer> eventCountdownMap = this.dateCalculator
                .generateEventCountdownMap();
        assertNotNull(eventCountdownMap);
        assertTrue(eventCountdownMap.hasKey("Birthday Countdown!"));
        assertEquals(expectedDays,
                (int) eventCountdownMap.value("Birthday Countdown!"));
    }

    @Test
    public void testToString() {
        assertEquals("Start Date: 2024-01-01\nEnd Date: 2024-01-10\n",
                this.dateCalculator.toString());
    }
}
