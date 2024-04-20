import components.map.Map;
import components.map.Map1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

public class DateToDateDemo {
    private String startDate;
    private String endDate;
    private String event;
    //private Map <String, Integer> countdownEventDays;

    // Kernel Methods

    /**
     * Sets the start date.
     *
     * @param startDate
     *            The start date.
     */
    public void setStartDate(String startDate) {
        //checks start day format by length.
        //also check if day and month is in range
        this.startDate = startDate;
    }

    /**
     * Gets the start date.
     *
     * @return The start date.
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * Sets the end date.
     *
     * @param endDate
     *            The end date.
     */
    public void setEndDate(String endDate) {
        //checks end day format by length.
        //also check if day and month is in range
        this.endDate = endDate;
    }

    /**
     * Gets the end date.
     *
     * @return The end date.
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * Checks if the start date is before the end date.
     *
     * @param startDate
     *            the start date
     * @param endDate
     *            the end date
     * @return true if the start date is before the end date, otherwise false
     */
    public static boolean isStartDateBeforeEndDate(String startDate,
            String endDate) {
        //convert month, day, year to integer
        //compare by year, month, day
        return true;
    }

    /**
     * Checks if the start date is before the end date.
     *
     * @param startDate
     *            the start date
     * @param endDate
     *            the end date
     * @return true if the start date is before the end date, otherwise false
     */
    public String getEvent() {
        return this.startDate;
    }

    // Secondary Methods

    /**
     * Calculates the number of days between the start and end dates.
     *
     * @return The number of days between the start and end dates.
     */
    public int calculateDaysBetween() {
        long difference = Integer.parseInt(this.endDate)
                - Integer.parseInt(this.startDate);
        return (int) (difference / (1000 * 60 * 60 * 24));
    }

    /**
     * Calculates the number of weeks between the start and end dates.
     *
     * @return The number of weeks between the start and end dates.
     */
    public int calculateWeeksBetween() {
        return this.calculateDaysBetween() / 7;
    }

    /**
     * Calculates the number of months between the start and end dates.
     *
     * @return The number of months between the start and end dates.
     */
    public int calculateMonthsBetween() {

        return 0;
    }

    public Map<String, Integer> generateEventCountdownMap() {
        Map<String, Integer> eventCountdownMap = new Map1L<>();

        eventCountdownMap.add(this.event, this.calculateDaysBetween());

        return eventCountdownMap;
    }

    /**
     * Calculates the number of years between the start and end dates.
     *
     * @return The number of years between the start and end dates.
     */
    public int calculateYearsBetween() {
        return 0;
    }

    public static void main(String[] args) {

        SimpleWriter out = new SimpleWriter1L();

        DateToDateDemo calculator = new DateToDateDemo();

        out.println("Days between: " + calculator.calculateDaysBetween());
        out.println("Weeks between: " + calculator.calculateWeeksBetween());
        out.println("Months between: " + calculator.calculateMonthsBetween());
        out.println("Years between: " + calculator.calculateYearsBetween());

        out.println(calculator.generateEventCountdownMap());
    }
}
