import components.map.Map;
import components.map.Map1L;

/**
 * Abstract class implementing secondary methods of the DateToDateCalculator
 * component.
 */
public abstract class DateToDateSecondary implements DateToDateKernel {

    public int calculateWeeksBetween() {
        // Implementation using kernel methods
        return this.calculateDaysBetween() / 7;
    }

    public int calculateMonthsBetween() {
        // Implementation using kernel methods
        // Get the start and end dates
        String startDate = this.getStartDate();
        String endDate = this.getEndDate();

        // Extract year, month, and day from start date
        int startYear = Integer.parseInt(startDate.substring(0, 4));
        int startMonth = Integer.parseInt(startDate.substring(5, 7));
        int startDay = Integer.parseInt(startDate.substring(8, 10));

        // Extract year, month, and day from end date
        int endYear = Integer.parseInt(endDate.substring(0, 4));
        int endMonth = Integer.parseInt(endDate.substring(5, 7));
        int endDay = Integer.parseInt(endDate.substring(8, 10));

        // Calculate months between start and end date
        int monthsBetween = (endYear - startYear) * 12
                + (endMonth - startMonth);
        if (endDay < startDay) {
            monthsBetween--; // Adjust if end day is before start day in the same month
        }
        return monthsBetween;
    }

    public int calculateYearsBetween() {
        // Implementation using kernel methods
        return this.calculateMonthsBetween() / 12;
    }

    public Map<String, Integer> generateEventCountdownMap() {
        // Implementation using kernel methods
        Map<String, Integer> eventCountdownMap = new Map1L<>();
        // Example event, replace with actual implementation
        eventCountdownMap.add("Example Event", this.calculateDaysBetween());
        return eventCountdownMap;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Start Date: ").append(this.getStartDate().toString())
                .append("\n");
        sb.append("End Date: ").append(this.getEndDate().toString())
                .append("\n");
        return sb.toString();

    }
}
