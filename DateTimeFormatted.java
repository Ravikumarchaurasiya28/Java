import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatted {
    public static void main(String[] args) {
        LocalDateTime ltd = LocalDateTime.now();
        System.out.println(ltd);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy -- E H:m:s a");
        String date = ltd.format(df);
        System.out.println(date);
    }
}
