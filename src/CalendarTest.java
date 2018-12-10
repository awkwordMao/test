import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest {

    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(new Date());
        calendar.add(Calendar.DATE, 1);
        System.out.println(calendar.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

        System.out.println(sdf.format(calendar.getTime()));

    }


}
