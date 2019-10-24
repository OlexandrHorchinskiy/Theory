package timeAndDate.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) throws ParseException {
        Calendar calendar = Calendar.getInstance(); // Gets the current date and time
        System.out.println("поточна дата = \t" + calendar.getTime());

        int year = calendar.get(Calendar.YEAR);       // The current year
        System.out.println("поточний рік = \t" + year);


//        calendar.add(Calendar.WEEK_OF_MONTH, 5); // додає задану кількість тижнів
        calendar.add(Calendar.DAY_OF_MONTH, 1); // додає задану кількість днів
        System.out.println("змінена дата = \t" + calendar.getTime());

//        DateFormat dateFormat1 = DateFormat.getDateInstance(DateFormat.SHORT);
//        System.out.println("форматована1 = " + dateFormat1.format(calendar.getTime()));
//
//        DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
//        System.out.println("форматована2 = " + dateFormat2.format(calendar.getTime()));
//
//        DateFormat dateFormat3 = DateFormat.getDateInstance(DateFormat.LONG);
//        System.out.println("форматована3 = " + dateFormat3.format(calendar.getTime()));
//
//        DateFormat dateFormat4 = DateFormat.getDateInstance(DateFormat.DATE_FIELD);
//        System.out.println("форматована4 = " + dateFormat4.format(calendar.getTime()));

// https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy"); // створення шаблону дати
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd  HH:mm:ss"); // створення шаблону дати
        System.out.println("simple = " + simpleDateFormat.format(calendar.getTime()));  // використовуючи шаблон друкує дату



        String myDate = "02/05/1984";
        Date parsedDate = simpleDateFormat.parse(myDate); // перетворення String myDate в обєкт Date newDate
        System.out.println("myDate = " + simpleDateFormat.format(parsedDate));

        Date date = new Date();
        System.out.println(date + "\t|\tформатована = " + simpleDateFormat.format(date));

        // 2014-12-31T06:04:13.000Z
    }
}