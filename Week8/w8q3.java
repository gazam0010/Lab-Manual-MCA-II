import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class w8q3 {
    public static void main(String[] args) {
        String dateString = "2024/03/07"; // Incorrectly formatted date string
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        dateFormat.setLenient(false);

        try {
            dateFormat.parse(dateString);
            System.out.println("Date parsed successfully: " + dateString);
        } catch (ParseException e) {
            System.out.println("Error parsing date: " + dateString);
        } finally {
            System.out.println("Closing resources...");
            // Since DateFormat doesn't implement AutoCloseable, we don't need to close it manually here
        }
    }
}
