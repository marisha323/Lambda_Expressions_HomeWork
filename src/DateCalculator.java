import java.time.temporal.ChronoUnit;
import java.util.function.Predicate;
import java.time.DayOfWeek;
import java.time.LocalDate;

class DateCalculator {
    public static Predicate<Integer> isLeapYear = year -> (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

    public static Long countDaysBetweenDates(LocalDate startDate, LocalDate endDate) {
        return ChronoUnit.DAYS.between(startDate, endDate);
    }

    public static Long countSundaysBetweenDates(LocalDate startDate, LocalDate endDate) {
        long sundays = 0;
        LocalDate current = startDate;
        while (!current.isAfter(endDate)) {
            if (current.getDayOfWeek() == DayOfWeek.SUNDAY) {
                sundays++;
            }
            current = current.plusDays(1);
        }
        return sundays;
    }
    public static DayOfWeek getDayofWeek(LocalDate date){
        return date.getDayOfWeek();
    }
}
