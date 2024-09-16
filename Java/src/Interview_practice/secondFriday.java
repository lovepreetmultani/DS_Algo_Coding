package src.Interview_practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class secondFriday {
    public static void main(String s[]){
        var currentDate = LocalDate.now();
        var firstDayOfMonth = currentDate.plusMonths(1).withDayOfMonth(1);
        var firstFriday = firstDayOfMonth.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
        var secondFriday = firstFriday.plusWeeks(1);
        System.out.println("second Friday is = "+secondFriday);
    }
}
