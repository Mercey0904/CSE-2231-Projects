import components.map.Map;
import components.map.Map1L;
import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

public class CountdownDemo2 {

    public static void main(String[] args) {

        SimpleReader in = new SimpleReader1L();
        SimpleWriter out = new SimpleWriter1L();

        // Create an instance of DateToDate1
        DateToDate1 dateCalculator = new DateToDate1();
        dateCalculator.setStartDate(2022, 1, 1);
        dateCalculator.setEndDate(2022, 12, 31);

        // Generate event countdown map
        Map<String, Integer> eventCountdownMap = new Map1L<>();
        eventCountdownMap.add("Example Event",
                dateCalculator.calculateDaysBetween());

        // Add additional events and their corresponding end dates
        DateToDate1 additionalDateCalculator = new DateToDate1();
        additionalDateCalculator.setStartDate(2022, 3, 15);
        additionalDateCalculator.setEndDate(2022, 3, 20);
        eventCountdownMap.add("Spring Break",
                additionalDateCalculator.calculateDaysBetween());

        additionalDateCalculator.setStartDate(2022, 6, 1);
        additionalDateCalculator.setEndDate(2022, 6, 30);
        eventCountdownMap.add("Summer Vacation",
                additionalDateCalculator.calculateDaysBetween());

        // Print the event countdown map
        out.println("Event Countdown Map:");
        for (Map.Pair<String, Integer> pair : eventCountdownMap) {
            out.println(pair.key() + ": " + pair.value() + " days");

            out.close();
            in.close();
        }
    }
}
