package ru.job4j.grabber.utils;


import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class SqlRuDateTimeParserTest {

    @Test
    public void testToday() {
        SqlRuDateTimeParser parser = new SqlRuDateTimeParser();
        String result  = "сегодня, 11:08";
        Assert.assertEquals(LocalDateTime.of(2021, 12, 28, 11, 8), parser.parse(result));
    }

    @Test
    public void testYesterday() {
        SqlRuDateTimeParser parser = new SqlRuDateTimeParser();
        String result  = "вчера, 16:42";
        Assert.assertEquals(LocalDateTime.of(2021, 12, 27, 16, 42), parser.parse(result));
    }

    @Test
    public void testAnyDate() {
        SqlRuDateTimeParser parser = new SqlRuDateTimeParser();
        String result  = "2 дек 21, 13:15";
        Assert.assertEquals(LocalDateTime.of(2021, 12, 2, 13, 15), parser.parse(result));
    }

}