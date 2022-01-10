package ru.job4j.grabber;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.StringJoiner;

public class Post {

    private int id;
    private String title;
    private String href;
    private String description;
    private LocalDateTime createDate;

    public Post(int id, String title, String href, String description, LocalDateTime createDate) {
        this.id = id;
        this.title = title;
        this.href = href;
        this.description = description;
        this.createDate = createDate;
    }

    public Post(String title, String href, String description, LocalDateTime createDate) {
        this.title = title;
        this.href = href;
        this.description = description;
        this.createDate = createDate;
    }

    public Post() {

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

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
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