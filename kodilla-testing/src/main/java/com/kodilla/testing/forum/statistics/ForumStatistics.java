package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class ForumStatistics {
    Statistics statistics;
    int postsCount;
    int commentsCount;
    int usersCount;
    private double averagePostsNoPerUser;
    private double averageCommentsNoPerUser;
    private double averageCommentsPerPost;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics){

        // obliczy podane powyżej wartości i zapamięta je we właściwościach (polach) klasy
        List<String> userNamesList = new ArrayList<String>();
        for (String user : statistics.usersNames()){
            userNamesList.add(user);
        }
        System.out.println(usersCount = userNamesList.size());

        statistics.postsCount(){
            System.out.println(postsCount);
        }

        statistics.commentsCount(){
            System.out.println(commentsCount);
        }



    }

    public double ShowStatistics(){
        // wyświetli zapamiętane we właściwościach statystyki
        System.out.println(averageCommentsNoPerUser = commentsCount / usersCount);

        System.out.println(averageCommentsPerPost = commentsCount / postsCount);

        System.out.println(averagePostsNoPerUser = postsCount / usersCount);
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
}
