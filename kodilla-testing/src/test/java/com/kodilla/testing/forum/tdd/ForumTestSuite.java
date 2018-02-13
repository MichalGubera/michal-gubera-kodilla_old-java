package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.*;

//Test suite for classes of Forum
public class ForumTestSuite {
    private static int testCounter = 0;

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

    @Test //czy po dodaniu nowego postu liczba postów wynosi 1
    public void testAddPost(){
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        //When
        forumUser.addPost("mrsmith", "hello everyone,this is my first contribution here!");
        //Then
        Assert.assertEquals(1, forumUser.getPostsQuantity());
    }

    @Test //czy po dodaniu nowego komentarza liczba komentarzy wynosi 1
    public void testAddComment(){
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrsmith");
        //When
        forumUser.addComment(thePost, "mrsmith", "Thank you for all good words!");
        //Then
        Assert.assertEquals(1, forumUser.getCommentsQuantity());
    }

    @Test //czy post pobrany z klasy ForumUser jest taki sam jak post, który był wstawiany do klasy
    public void testGetPost(){
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
        //When
        ForumPost retrivedPost = forumUser.getPost(0);
        //Then
        Assert.assertEquals(thePost, retrivedPost);
    }

    @Test //czy komentarz pobrany z klasy ForumUser jest taki sam, jak komentarz, który był wstawiany do klasy
    public void testGetComment(){
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "Thank you for all good words!",
                "mrsmith");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());
        //When
        ForumComment retrivedComment = forumUser.getComment(0);
        //Then
        Assert.assertEquals(theComment, retrivedComment);
    }

    @Test //czy próba usunięcia nieistniejącego posta skończy się zwróceniem wyniku false
    public void testRemovePostNotExisting(){
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");

        //When
        boolean result = forumUser.removePost(thePost);

        //Then
        Assert.assertFalse(result);
    }

    @Test // czy próba usunięcia nieistniejącego komentarza skończy się zwróceniem wyniku false
    public void testRemoveCommentNotExisting(){
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "mrsmith",
                "Thank you for all good words!");

        //When
        boolean result = forumUser.removeComment(theComment);

        //Then
        Assert.assertFalse(result);
    }

    @Test //czy udało się usunąć wybrany post z klasy
    public void testRemovePost(){
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

        //When
        boolean result = forumUser.removePost(thePost);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getPostsQuantity());
    }

    @Test//czy udało się usunąć wybrany komentarz z klasy
    public void testRemoveComment(){
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "mrsmith",
                "Thank you for all good words!");
        forumUser.addComment(thePost, theComment.getAuthor(),
                theComment.getCommentBody());

        //When
        boolean result = forumUser.removeComment(theComment);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getCommentsQuantity());
    }
}