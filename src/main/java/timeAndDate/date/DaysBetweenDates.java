package timeAndDate.date;

import java.text.SimpleDateFormat;
import java.util.*;

public class DaysBetweenDates {
    public static void main(String args[]) {
        String date1 = "02.05.1984";
        String date2 = "06.07.2019";

        //
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

        Date dateOne = null;
        Date dateTwo = null;

        try {
            dateOne = format.parse(date1);
            dateTwo = format.parse(date2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Кількість днів між датами в мілісекундах
        long difference = dateTwo.getTime() - dateOne.getTime();

        // Перетворення кількості днів між датами з мілісекунд в дні
        int days = (int) ( difference / ( 24 * 60 * 60 * 1000 ) );  // мілісекунди / (24год. * 60хв. * 60сек * 1000мс)
                                                                    // 1 секудна    = 1000      мілісекунд
                                                                    // 1 хвилина    = 60000     мілісекунд
                                                                    // 1 година     = 3600000   мілісекунд
                                                                    // 1 доба       = 86400000  мілісекунд
        // Вивід різниці між датами в днях
        System.out.println("різниця між датами " + days + " днів");



        long yourMilliseconds = 1322018752992l;
        //1322018752992-Nov 22, 2011 9:25:52 PM
        GregorianCalendar calendar = new GregorianCalendar(TimeZone.getTimeZone("US/Central"));
        calendar.setTimeInMillis(yourMilliseconds);
    }
}