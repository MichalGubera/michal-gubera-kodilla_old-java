package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    private static int testCounter = 0;
    Statistics statisticsMock = null;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);

    }

    @Test
    public void testCalculateAdvStatistics0Posts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
       int postsCount = 0;
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, forumStatistics.getPostsCount());
    }

    @Test
    public void testCalculateAdvStatistics1000Posts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsCount = 1000;
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(1000, forumStatistics.getPostsCount());
    }

    @Test
    public void testCalculateAdvStatistics0Comments(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int commentsCount = 0;
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, forumStatistics.getCommentsCount());
    }

    @Test
    public void testCalculateAdvStatisticsCommentsLessThanPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.commentsCount()).thenReturn(500);
        when(statisticsMock.postsCount()).thenReturn(5000);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertTrue(forumStatistics.getCommentsCount()<forumStatistics.getPostsCount());
    }

    @Test
    public void testCalculateAdvStatisticsCommentsMoreThanPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(50);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertTrue(forumStatistics.getCommentsCount()>forumStatistics.getPostsCount());
    }

    @Test
    public void testCalculateAdvStatistics0Users(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNamesList = new ArrayList<String>();
//        usersNamesList.add("Joe");
//        usersNamesList.add("Mick");
//        usersNamesList.add("Paul");
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, forumStatistics.getUsersCount());
    }

    @Test
    public void testCalculateAdvStatistics100Users(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNamesList = new ArrayList<String>();
        for(int i=0; i<100; i++){
            usersNamesList.add("Name" + i);
        }

        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100, forumStatistics.getUsersCount());
    }
}
