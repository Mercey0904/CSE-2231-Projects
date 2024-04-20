import components.standard.Standard;

/**
 * Enhanced interface for date-to-date calculations.
 *
 * @extends Standard
 */
public interface DateToDateKernel extends Standard {

    /**
     * Sets the start date.
     *
     * @param year
     *            The year of the start date.
     * @param month
     *            The month of the start date.
     * @param day
     *            The day of the start date.
     * @requires year > 0 && 1 <= month <= 12 && 1 <= day <= 31
     */
    void setStartDate(int year, int month, int day);

    /**
     * Gets the start date.
     *
     * @return The start date in string format.
     * @ensures result != null
     */
    String getStartDate();

    /**
     * Sets the end date.
     *
     * @param year
     *            The year of the end date.
     * @param month
     *            The month of the end date.
     * @param day
     *            The day of the end date.
     * @requires year > 0 && 1 <= month <= 12 && 1 <= day <= 31
     */
    void setEndDate(int year, int month, int day);

    /**
     * Gets the end date.
     *
     * @return The end date in string format.
     * @ensures result != null
     */
    String getEndDate();

    /**
     * Checks if the start date is before the end date.
     *
     * @return true if the start date is before the end date, otherwise false.
     */
    boolean isStartDateBeforeEndDate();

    /**
     * Calculates the number of days between the start and end dates.
     *
     * @return The number of days between the start and end dates.
     * @ensures result >= 0
     */
    int calculateDaysBetween();

    /**
     * Gets the event.
     *
     * @return The event.
     * @ensures result != null
     */
    String getEvent();

}
