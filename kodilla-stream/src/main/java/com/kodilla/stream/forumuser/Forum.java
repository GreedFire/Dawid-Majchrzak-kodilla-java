package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    List<ForumUser> userList;

    public Forum() {
        userList = new ArrayList<ForumUser>();
        userList.add(new ForumUser("Username1", 'M', 22, 5, 1996, 500));
        userList.add(new ForumUser("Username2", 'M', 22, 5, 2006, 500));
        userList.add(new ForumUser("Username3", 'F', 22, 5, 1996, 500));
        userList.add(new ForumUser("Username4", 'M', 22, 5, 1996, 0));
        userList.add(new ForumUser("Username5", 'M', 22, 5, 1990, 500));
    }

    public List<ForumUser> getUserList() {
        return userList;
    }
}
