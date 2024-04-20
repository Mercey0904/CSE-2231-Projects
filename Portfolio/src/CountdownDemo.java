import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

public class CountdownDemo {

    public static void main(String[] args) {
        SimpleReader in = new SimpleReader1L();
        SimpleWriter out = new SimpleWriter1L();

        // Prompt user to input start and end dates
        out.println("Enter start date (YYYY-MM-DD):");
        String startDateInput = in.nextLine();

        out.println("Enter end date (YYYY-MM-DD):");
        String endDateInput = in.nextLine();

        // Parse input dates
        String[] startDateParts = startDateInput.split("-");
        String[] endDateParts = endDateInput.split("-");

        // Create an instance of DateToDate1
        DateToDate1 dateCalculator = new DateToDate1();
        dateCalculator.setStartDate(Integer.parseInt(startDateParts[0]),
                Integer.parseInt(startDateParts[1]),
                Integer.parseInt(startDateParts[2]));
        dateCalculator.setEndDate(Integer.parseInt(endDateParts[0]),
                Integer.parseInt(endDateParts[1]),
                Integer.parseInt(endDateParts[2]));

        // Calculate and display the number of days between the start and end dates
        int daysBetween = dateCalculator.calculateDaysBetween();
        out.println("Days between the start and end dates: " + daysBetween);

        in.close();
        out.close();
    }
}
