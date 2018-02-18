package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        Random r1 = new Random();
        Random r2 = new Random();
        Random r3 = new Random();
        Random r4 = new Random();
        Random r5 = new Random();
        Random r6 = new Random();
        String gender = "MF";
        userList.add(new ForumUser(1,"Adam", 'M', 1970, 7, 7, 1));
        userList.add(new ForumUser(2,"Betty", 'F', 1970, 9, 9, 2));
        userList.add(new ForumUser(3,"Cate", 'F', 2000, 5, 5, 0));
        userList.add(new ForumUser(4,"Francesca", 'F', 1996, 3, 25, 5));
        userList.add(new ForumUser(5,"Jonah", 'M', 1998, 2, 20, 3));
        userList.add(new ForumUser(6,"Zack", 'M', 2002, 5, 5, 5));
        for (int i=1; i<1500; i++){
            userList.add(new ForumUser(6 + i, "user" + i, gender.charAt(r1.nextInt(2)), r2.nextInt(2012)+1956,r3.nextInt(11)+1, r4.nextInt(27)+1, r5.nextInt(7)));
        }
    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(userList);
    }
}
