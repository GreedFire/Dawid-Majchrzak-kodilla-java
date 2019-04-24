package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {

    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private int avgPostsPerUser;
    private int avgCommentsPerUser;
    private int avgCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        this.usersCount = statistics.usersNames().size();
        this.postsCount = statistics.postsCount();
        this.commentsCount = statistics.commentsCount();

        if(usersCount != 0) {
            this.avgPostsPerUser = (this.postsCount / this.usersCount);
            this.avgCommentsPerUser = (this.commentsCount / this.usersCount);
        }
        if(postsCount != 0)
            this.avgCommentsPerPost = (this.commentsCount/this.postsCount);
    }

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public int getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public int getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public int getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }

    @Override
    public String toString() {
        return "CalculateStatistics{" +
                "usersCount=" + usersCount +
                ", postsCount=" + postsCount +
                ", commentsCount=" + commentsCount +
                ", avgPostsByUsers=" + avgPostsPerUser +
                ", avgCommentsByUsers=" + avgCommentsPerUser +
                ", avgCommentsPerPost=" + avgCommentsPerPost +
                '}';


    }
}
