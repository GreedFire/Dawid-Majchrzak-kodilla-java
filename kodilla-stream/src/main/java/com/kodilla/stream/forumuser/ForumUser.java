package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private static int ID = 1;
    private int userID;
    private String userName;
    private char sex;
    private LocalDate dateOfBirth;
    private int postCount;

    public ForumUser(String userName, char sex, int d, int m, int y, int postCount) {
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(y, m , d);
        this.postCount = postCount;
        this.userID = this.ID;
        this.ID++;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostCount() {
        return postCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", postCount=" + postCount +
                '}';
    }
}
