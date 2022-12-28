package hello.fundamental.classes.CalenderTest;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalenderTest {
    public static void main(String[] args) {
        // LocalDate newDate = LocalDate.of(1999, 12, 31)
        LocalDate date = LocalDate.now(); // 1999/12/31
        int month = date.getMonthValue(); // 12
        int today = date.getDayOfMonth(); // 31

        date = date.minusDays(today - 1); // 11

        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++)
            System.out.print(" ");
        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print(" ");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1)
                System.out.println();
        }
    }

}
