package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dateFormatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String myDate = dt.format(df);
        String myDate2 = dt.format(df2);
        System.out.println(myDate);
        System.out.println(df2);
    }
}
