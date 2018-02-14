package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class ForumStatistics {
    Statistics statistics;
    int postsCount;
    int commentsCount;
    int usersCount;
    private int averagePostsNoPerUser;
    private int averageCommentsNoPerUser;
    private int averageCommentsPerPost;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public int calculateAdvStatistics(Statistics statistics){

        // obliczy podane powyżej wartości i zapamięta je we właściwościach (polach) klasy
        List<String> userNamesList = new ArrayList<String>();
        for (String user : statistics.usersNames()){
            userNamesList.add(user);
        }
        return usersCount = userNamesList.size();

        statistics.postsCount(){
            return postsCount;
        }

        statistics.commentsCount(){
            return commentsCount;
        }

        this.averageCommentsNoPerUser = commentsCount / usersCount;

        this.averageCommentsPerPost = commentsCount / postsCount;

        this.averagePostsNoPerUser = postsCount / usersCount;

    }

    public int ShowStatistics(){
        // wyświetli zapamiętane we właściwościach statystyki
        return averageCommentsNoPerUser;

        return averageCommentsPerPost;

        return averagePostsNoPerUser;
    }

}
