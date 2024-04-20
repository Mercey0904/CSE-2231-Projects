import components.map.Map;

/**
 * Enhanced interface for the DateToDateCalculator component.
 *
 * @extends DateToDateKernel
 */
public interface DateToDate extends DateToDateKernel {

    /**
     * Calculates the number of weeks between the start and end dates.
     *
     * @return The number of weeks between the start and end dates.
     * @param startDate
     *            the start date
     * @param endDate
     *            the end date
     * @ensures result >= 0
     */
    int calculateWeeksBetween();

    /**
     * Calculates the number of months between the start and end dates.
     *
     * @return The number of months between the start and end dates.
     * @param startDate
     *            the start date
     * @param endDate
     *            the end date
     * @ensures result >= 0
     */
    int calculateMonthsBetween();

    /**
     * Calculates the number of years between the start and end dates.
     *
     * @return The number of years between the start and end dates.
     * @param startDate
     *            the start date
     * @param endDate
     *            the end date
     * @ensures result >= 0
     */
    int calculateYearsBetween();

    /**
     * Generates a countdown map for the events from start date to end date.
     *
     * @return A map of events and their countdown days.
     * @param startDate
     *            the start date
     * @param endDate
     *            the end date
     */
    Map<String, Integer> generateEventCountdownMap();

    /**
     * Converts start time and end time to single statement
     *
     * @param startDate
     *            the start date
     * @param endDate
     *            the end date
     * @return A string representation of start and end time
     */
    @Override
    String toString();

}
