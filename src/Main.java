package src;

import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int year = date.getYear();
        String month = String.valueOf(date.getMonth());
        int dayNumber = date.getDayOfMonth();
        String dayWeek = String.valueOf(date.getDayOfWeek());
        System.out.println("Year: " + year + "\nMonth: " + month + "\nDay of the week: " + dayWeek + "\nDay of the month: " + dayNumber);

    }
}
