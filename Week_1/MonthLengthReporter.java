// 1. write a program that, for a given year reports the length of each month within that year.
package Week_1;
import java.time.*;

public class MonthLengthReporter {
    public static void main(String[] args) {
        int year = 2025; // Example year
        System.out.println("Month lengths for the year " + year + ":");
        for (Month month : Month.values()) {
            int length = month.length(Year.isLeap(year));
            System.out.println(month + ": " + length + " days");
        }
    }
}

