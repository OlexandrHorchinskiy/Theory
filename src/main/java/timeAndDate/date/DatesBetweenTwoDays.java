package timeAndDate.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DatesBetweenTwoDays {
    public static void main(String args[]) throws ParseException {
        // вхідні дані
        String dateStartString = "20190420";
        String dateFinishString = "20190605";


        // встановлюємо формат дати
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");

        // перетворення String в Date в Long
        // варіант 1
//            // перетворення String в Date
//        Date dateStartDate = simpleDateFormat.parse(dateStartString);
//        Date dateFinishDate = simpleDateFormat.parse(dateFinishString);
//
//            // перетворення Date в Long
//        long dateStartLong = dateStartDate.getTime();
//        long dateFinishLong = dateFinishDate.getTime();


        // варіант 2
        // перетворення String в Date в Long
        long dateStartLong = simpleDateFormat.parse(dateStartString).getTime();
        long dateFinishLong = simpleDateFormat.parse(dateFinishString).getTime();


        // перелік всіх днів між dateStart та dateFinish
        GregorianCalendar calendar = new GregorianCalendar(TimeZone.getTimeZone("US/Central"));
        long day = 0;
        for (day = dateStartLong; day <= dateFinishLong; day += 86400000) {
            calendar.setTimeInMillis(day);
            System.out.println("date = " + simpleDateFormat.format(calendar.getTime()));
        }
    }
}

// 1 секудна    = 1000      мілісекунд
// 1 хвилина    = 60000     мілісекунд
// 1 година     = 3600000   мілісекунд
// 1 доба       = 86400000  мілісекунд