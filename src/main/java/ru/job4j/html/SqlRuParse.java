package ru.job4j.html;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SqlRuParse {
    public static void main(String[] args) throws Exception {
        Document doc = Jsoup.connect("https://www.sql.ru/forum/job-offers").get();
        Elements row = doc.select(".postslisttopic");
        for (Element td : row) {
            Element parent = td.parent();
            assert parent != null;
            System.out.print(parent.children().get(5).text() + " ");
            System.out.println(td.child(0).text());
            System.out.println(td.child(0).attr("href"));
        }
    }
}