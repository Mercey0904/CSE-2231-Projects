import java.util.Calendar;

public class DateToDate1 implements DateToDateKernel {

    private Calendar startDate;
    private Calendar endDate;
    private String event;

    // Constructor
    public DateToDate1() {
        // Initialize the start and end dates to the current date
        this.startDate = Calendar.getInstance();
        this.endDate = Calendar.getInstance();
    }

    // Copy constructor
    public DateToDate1(DateToDate1 other) {
        this.startDate = (Calendar) other.startDate.clone();
        this.endDate = (Calendar) other.endDate.clone();
        this.event = other.event;
    }

    @Override
    public void setStartDate(int year, int month, int day) {
        // Set the start date
        this.startDate.set(year, month - 1, day); // Month is 0-based in Calendar
    }

    @Override
    public void setEndDate(int year, int month, int day) {
        // Set the end date
        this.endDate.set(year, month - 1, day); // Month is 0-based in Calendar
    }

    @Override
    public boolean isStartDateBeforeEndDate() {
        // Check if the start date is before the end date
        return this.startDate.before(this.endDate);
    }

    @Override
    public void clear() {
        // Clear the start and end dates
        this.startDate.clear();
        this.endDate.clear();
        this.event = null;
    }

    @Override
    public Object newInstance() {
        // Create a new instance of DateToDate1 using copy constructor
        return new DateToDate1(this);
    }

    @Override
    public void transferFrom(Object source) {
        if (source instanceof DateToDate1) {
            DateToDate1 src = (DateToDate1) source;
            this.startDate = (Calendar) src.startDate.clone();
            this.endDate = (Calendar) src.endDate.clone();
            this.event = src.event;
            src.clear(); // Clear the source representation
        } else {
            throw new IllegalArgumentException(
                    "Invalid source type for transferFrom");
        }
    }

    @Override
    public String getStartDate() {
        // Get the start date as a string
        return this.startDate.toString();
    }

    @Override
    public String getEndDate() {
        // Get the end date as a string
        return this.endDate.toString();
    }

    @Override
    public String getEvent() {
        // Get the event
        return this.event;
    }

    @Override
    public int calculateDaysBetween() {
        // Calculate the number of days between the start and end dates
        long milliseconds1 = this.startDate.getTimeInMillis();
        long milliseconds2 = this.endDate.getTimeInMillis();
        long diff = milliseconds2 - milliseconds1;
        return (int) (diff / (1000 * 60 * 60 * 24));
    }

    @Override
    public String toString() {
        // Return a string representation of the object
        return "Start Date: " + this.getStartDate() + "\n" + "End Date: "
                + this.getEndDate();
    }
}
