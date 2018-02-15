package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    @Test
    public void testCalculateAdvStatistics(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNamesList = new ArrayList<String>();
        usersNamesList.add("Joe");
        usersNamesList.add("Mick");
        usersNamesList.add("Paul");

        when(statisticsMock.usersNames()).thenReturn(usersNamesList);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        int usersCount = forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(3, usersCount);
    }
}
