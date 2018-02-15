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

        // obliczy podane powyżej wartości i zapamięta je we właściwościach (polach) klasy
//        ArrayList<String> users = new ArrayList<String>();
//        for (String user: statistics.usersNames()){
//            users.add(user);
//        }

        this.usersCount = statistics.usersNames().size();
        this.postsCount = statistics.postsCount();
        this.commentsCount = statistics.commentsCount();
        this.averageCommentsNoPerUser = statistics.commentsCount() / statistics.usersNames().size();
        this.averageCommentsPerPost = statistics.commentsCount() / statistics.usersNames().size();
        this.averagePostsNoPerUser = statistics.postsCount() / statistics.usersNames().size();
    }

    public void ShowStatistics(){
        // wyświetli zapamiętane we właściwościach statystyki

        System.out.println("Średnia ilość postów na użytkownika " + averagePostsNoPerUser);
        System.out.println("Średnia ilość komentarzy na użytkownika " + averageCommentsNoPerUser);
        System.out.println("Średnia ilość komentarzy na post " + averageCommentsPerPost);
    }
}
