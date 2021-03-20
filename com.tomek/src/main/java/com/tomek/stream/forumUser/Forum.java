package com.tomek.stream.forumUser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    List<ForumUser> listOfForumUsers;
    List<ForumUser> getUserList(){

        return new ArrayList<>(listOfForumUsers);
    }
}
