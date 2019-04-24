package com.kodilla.patterns.strategy.social.users;

import com.kodilla.patterns.strategy.social.socialPublishers.SocialPublisher;

public class User {
    final private String userName;
    protected SocialPublisher socialPublisher;

    public User(final String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setSocialPublisher(SocialPublisher socialPublisher){
        this.socialPublisher = socialPublisher;
    }

    public String shareContent(){
        return socialPublisher.share();
    }
}
