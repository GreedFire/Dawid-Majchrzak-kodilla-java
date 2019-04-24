package com.kodilla.patterns.strategy.social.socialPublishers;

public class FacebookPublisher implements SocialPublisher {

    public String share(){
        return "Shared facebook content";
    }
}
