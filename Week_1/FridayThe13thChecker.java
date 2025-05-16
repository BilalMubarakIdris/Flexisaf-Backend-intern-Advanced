// 3. write a program that tests whether a given date occurs on Friday the 13th.
package Week_1;

import java.time.*;

public class FridayThe13thChecker {
    public static void main(String[] args) {
        int year = 2025, month = 6, day = 13; // Example: June 13, 2025
        boolean isFriday = isFridayThe13th(year, month, day);
        System.out.println(year + "-" + month + "-" + day + " is Friday the 13th: " + isFriday);
    }

    public static boolean isFridayThe13th(int year, int month, int day) {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfMonth() == 13 && date.getDayOfWeek() == DayOfWeek.FRIDAY;
    }
}
