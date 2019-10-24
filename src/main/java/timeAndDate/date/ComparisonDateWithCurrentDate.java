package timeAndDate.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class ComparisonDateWithCurrentDate {
    public static void main(String args[]) throws ParseException {
        GregorianCalendar calendar = new GregorianCalendar(TimeZone.getTimeZone("US/Central"));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd"); // встановлює формат дати

        String dateForComparison = "2019-09-03"; // дата для порівняння
        String currentDate = simpleDateFormat.format(calendar.getTime()); // поточна дата

        // перетворення String в Date в Long
        long dateForComparisonLong = simpleDateFormat.parse(dateForComparison).getTime();
        long currentDateLong = simpleDateFormat.parse(currentDate).getTime();

        if (dateForComparisonLong > currentDateLong) {
            System.out.println("Дата " + dateForComparison + " буде після поточної.");
        } else if (dateForComparisonLong < currentDateLong) {
            System.out.println("Дата " + dateForComparison + " була до поточної.");
        } else {
            System.out.println("Дата " + dateForComparison + " є поточною.");
        }
    }
}