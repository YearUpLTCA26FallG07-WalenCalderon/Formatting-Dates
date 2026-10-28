
package com.pluralsight;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        // Get current date and time
        ZonedDateTime localTime = ZonedDateTime.now();
        ZonedDateTime gmtTime = localTime.withZoneSameInstant(
                ZoneId.of("GMT")
        );

        // Create date formatters
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern(
                "EEEE, MMMM dd, yyyy", Locale.ENGLISH
        );
        DateTimeFormatter format4 = DateTimeFormatter.ofPattern(
                "EEEE, MMM dd, yyyy HH:mm", Locale.ENGLISH
        );
        DateTimeFormatter format5 = DateTimeFormatter.ofPattern(
                "h:mm 'on' dd-MMM-yyyy", Locale.ENGLISH
        );

        // Display formatted dates
        System.out.println(localTime.format(format1));
        System.out.println(localTime.format(format2));
        System.out.println(localTime.format(format3));
        System.out.println(gmtTime.format(format4));

        // Challenge: Display local time
        System.out.println(localTime.format(format5));
    }
}
