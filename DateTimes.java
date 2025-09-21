import java.time.*;
import java.util.*;

public class DateTimes {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()/1000/3600/365/24);
        //tell this method that which years gone since 1 jan 1970.
        Date d = new Date();
        System.out.println(d);
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        LocalTime lt = LocalTime.now();
        System.out.println(lt);
        LocalDateTime ltd = LocalDateTime.now();
        System.out.println(ltd);
    }
}
