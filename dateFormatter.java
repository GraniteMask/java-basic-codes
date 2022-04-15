package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dateFormatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(df);
    }
}
