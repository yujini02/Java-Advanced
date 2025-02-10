package day06.dateEx;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarEx {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH)+1;
        int day = now.get(Calendar.DAY_OF_MONTH);
        int week = now.get(Calendar.DAY_OF_WEEK);
        int ampm = now.get(Calendar.AM_PM);
        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        System.out.println(year+"년"+month+"월"+day+"일 "+hour+"시"+minute+"분");

        String[] availableIDs = TimeZone.getAvailableIDs();
        for(String id : availableIDs) System.out.println(id);
    }
}
