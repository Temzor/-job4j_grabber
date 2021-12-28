package ru.job4j.grabber.utils;

import javax.swing.text.Document;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;

public class SqlRuDateTimeParser implements DateTimeParser {

    private static final Map<String, Integer> MONTHS = Map.ofEntries(
            Map.entry("янв", 1),
            Map.entry("фев", 2),
            Map.entry("мар", 3),
            Map.entry("апр", 4),
            Map.entry("май", 5),
            Map.entry("июн", 6),
            Map.entry("июл", 7),
            Map.entry("авг", 8),
            Map.entry("сен", 9),
            Map.entry("окт", 10),
            Map.entry("ноя", 11),
            Map.entry("дек", 12)
    );


    @Override
    public LocalDateTime parse(String parse) {
        LocalDate date;
        LocalTime time;
        String[] splitDate = parse.split(",");
        switch (splitDate[0]) {
            case "сегодня" :
                date = LocalDate.now();
                break;
            case "вчера" :
                date = LocalDate.now().minusDays(1);
                break;
            default:
                for (Map.Entry<String, Integer> stringIntegerEntry : MONTHS.entrySet()) {
                    splitDate[0] = splitDate[0].replaceFirst(stringIntegerEntry.getKey(), String.valueOf(stringIntegerEntry.getValue()));
                }
                String[] anyDate = splitDate[0].split(" ");
                date = LocalDate.of(
                        2000 + Integer.parseInt(anyDate[2]),
                        Integer.parseInt(anyDate[1]),
                        Integer.parseInt(anyDate[0])
                );
                break;
        }

        time = LocalTime.of(Integer.parseInt(splitDate[1].split(":")[0].trim()),
                Integer.parseInt(splitDate[1].split(":")[1]));

        return LocalDateTime.of(date, time);
    }
}