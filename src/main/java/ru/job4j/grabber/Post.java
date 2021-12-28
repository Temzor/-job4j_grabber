package ru.job4j.grabber;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.StringJoiner;

public class Post {

    private final int id;
    private final String title;
    private final String href;
    private final String description;
    private final LocalDateTime createDate;

    public Post(int id, String title, String href, String description, LocalDateTime createDate) {
        this.id = id;
        this.title = title;
        this.href = href;
        this.description = description;
        this.createDate = createDate;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getHref() {
        return href;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Post.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("title='" + title + "'")
                .add("href='" + href + "'")
                .add("description='" + description + "'")
                .add("createDate=" + createDate)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Post post = (Post) o;
        return id == post.id
                && Objects.equals(title, post.title)
                && Objects.equals(href, post.href)
                && Objects.equals(createDate, post.createDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, href, createDate);
    }
}
