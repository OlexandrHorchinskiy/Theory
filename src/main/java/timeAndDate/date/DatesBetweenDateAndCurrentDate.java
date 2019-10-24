package timeAndDate.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DatesBetweenDateAndCurrentDate {
    public static void main(String args[]) throws ParseException {
        GregorianCalendar calendar = new GregorianCalendar(TimeZone.getTimeZone("US/Central"));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd"); // встановлюємо формат дати

        String dateForComparison = "2019-09-05"; // дата для порівняння
        String currentDate = simpleDateFormat.format(calendar.getTime()); // поточна дата

        // перетворення String в Date в Long
        long dateForComparisonLong = simpleDateFormat.parse(dateForComparison).getTime();
        long currentDateLong = simpleDateFormat.parse(currentDate).getTime();

        // перелік всіх днів між dateStart та dateFinish
        long day = 0;
        if (dateForComparisonLong > currentDateLong) {
            for (day = dateForComparisonLong; day >= currentDateLong; day -= 86400000) {
                calendar.setTimeInMillis(day);
                System.out.println("date = " + simpleDateFormat.format(calendar.getTime()));
            }
        } else if (dateForComparisonLong < currentDateLong) {
            for (day = dateForComparisonLong; day <= currentDateLong; day += 86400000) {
                calendar.setTimeInMillis(day);
                System.out.println("date = " + simpleDateFormat.format(calendar.getTime()));
            }
        } else {
            System.out.println("date = " + currentDate);
        }
    }
}

// 1 секудна    = 1000      мілісекунд
// 1 хвилина    = 60000     мілісекунд
// 1 година     = 3600000   мілісекунд
// 1 доба       = 86400000  мілісекунд