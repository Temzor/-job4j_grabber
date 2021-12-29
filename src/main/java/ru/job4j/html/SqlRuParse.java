package ru.job4j.html;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import ru.job4j.grabber.Parse;
import ru.job4j.grabber.Post;
import ru.job4j.grabber.utils.DateTimeParser;
import ru.job4j.grabber.utils.SqlRuDateTimeParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SqlRuParse implements Parse {
    private final DateTimeParser dateTimeParser;

    public SqlRuParse(DateTimeParser dateTimeParser) {
        this.dateTimeParser = dateTimeParser;
    }

    @Override
    public List<Post> list(String url) throws IOException {
        List<Post> posts = new ArrayList<>();
        Document doc = Jsoup.connect(url).get();
        Elements row = doc.select(".postslisttopic");
        for (Element post : row) {
            Element parent = post.parent();
            assert parent != null;
            System.out.print(parent.children().get(5).text() + " ");
            System.out.println(post.child(0).text());
            System.out.println(post.child(0).attr("href"));
        }
        return posts;
    }

    @Override
    public Post detail(String url) throws IOException {
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
