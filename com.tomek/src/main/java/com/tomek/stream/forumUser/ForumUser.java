package com.tomek.stream.forumUser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userId;
    private final String userName;
    private final char sex;
    private final LocalDate bithDate;
    private final int publishedPosts;

    public ForumUser(int userId, String userName, char sex, LocalDate bithDate, int publishedPosts) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.bithDate = bithDate;
        this.publishedPosts = publishedPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBithDate() {
        return bithDate;
    }

    public int getPublishedPosts() {
        return publishedPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", bithDate=" + bithDate +
                ", publishedPosts=" + publishedPosts +
                '}';
    }
}
