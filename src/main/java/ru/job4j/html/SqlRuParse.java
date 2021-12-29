package ru.job4j.html;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import ru.job4j.grabber.Post;
import ru.job4j.grabber.utils.SqlRuDateTimeParser;

public class SqlRuParse {
    public static void main(String[] args) throws Exception {
        String url = "https://www.sql.ru/forum/job-offers";
        for (int i = 1; i <= 5; i++) {
                System.out.println(url);
                Document doc = Jsoup.connect("https://www.sql.ru/forum/job-offers" + "/" + i).get();
                Elements row = doc.select(".postslisttopic");
                for (Element post : row) {
                    Element parent = post.parent();
                    assert parent != null;
                    System.out.print(parent.children().get(5).text() + " ");
                    System.out.println(post.child(0).text());
                    System.out.println(post.child(0).attr("href"));
            }
        }
    }
    public static Post getPost(String url) throws Exception {
        Document doc = Jsoup.connect(url).get();
        Elements header = doc.select(".messageHeader");
        Elements message = doc.select(".msgBody");
        Elements date = doc.select(".msgFooter");
        SqlRuDateTimeParser lastDateTime = new SqlRuDateTimeParser();
        return new Post(header.get(0).text(),
                url,
                message.get(1).text(),
                lastDateTime.parse(date.get(0).text().substring(0, date.get(0).text().indexOf("[")).trim()));
    }
}