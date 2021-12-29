package ru.job4j.grabber.utils;


import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDateTime;


public class SqlRuDateTimeParserTest {

    public void testAnyDate() {
        SqlRuDateTimeParser parser = new SqlRuDateTimeParser();
        String result  = "2 дек 21, 13:15";
        Assert.assertEquals(LocalDateTime.of(2021, 12, 2, 13, 15), parser.parse(result));
    }
}