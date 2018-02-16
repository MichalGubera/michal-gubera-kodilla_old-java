package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class ForumStatistics {
    Statistics statistics;
    private int postsCount;
    private int commentsCount;
    private int usersCount;
    private double averagePostsNoPerUser;
    private double averageCommentsNoPerUser;
    private double averageCommentsPerPost;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public int getUsersCount() {
        return usersCount;
    }

    public double getAveragePostsNoPerUser() {
        return averagePostsNoPerUser;
    }

    public double getAverageCommentsNoPerUser() {
        return averageCommentsNoPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }


    public void calculateAdvStatistics(Statistics statistics){

        this.usersCount = statistics.usersNames().size();
        this.postsCount = statistics.postsCount();
        this.commentsCount = statistics.commentsCount();
        this.averageCommentsNoPerUser = ((statistics.usersNames().size()>0) ? (statistics.commentsCount()/statistics.usersNames().size()) : 0);
        this.averageCommentsPerPost = ((statistics.postsCount()>0) ? (statistics.commentsCount()/statistics.postsCount()) : 0);
        if(usersCount> 0){
            this.averagePostsNoPerUser = statistics.postsCount() / statistics.usersNames().size();
        } else {
            this.averagePostsNoPerUser = 0;
        }
    }

    public void showStatistics(){
        // wyświetli zapamiętane we właściwościach statystyki

        System.out.println("Średnia ilość postów na użytkownika " + getAveragePostsNoPerUser());
        System.out.println("Średnia ilość komentarzy na użytkownika " + getAverageCommentsNoPerUser());
        System.out.println("Średnia ilość komentarzy na post " + getAverageCommentsPerPost());
    }
}
