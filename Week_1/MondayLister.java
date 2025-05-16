// 2. write a program that, for a given month of the current year, lists all of the Mondays in that month.
package Week_1;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class MondayLister {
    public static void main(String[] args) {
        int month = 10; // Example: October
        listMondays(month);
    }

    public static void listMondays(int month) {
        LocalDate date = LocalDate.of(Year.now().getValue(), month, 1);
        System.out.println("Mondays in " + date.getMonth() + " " + Year.now().getValue() + ":");
        while (date.getMonthValue() == month) {
            if (date.getDayOfWeek() == DayOfWeek.MONDAY) {
                System.out.println(date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            }
            date = date.plusDays(1);
        }
    }
}

