package com.kodilla.testing.forum.statistics;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class ForumStatisticsTestSuite {
    @Test
    public void testCalculateAdvStatistics(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        //When
        int postsCount = forumStatistics.calculateAdvStatistics();
        //Then

    }
}
