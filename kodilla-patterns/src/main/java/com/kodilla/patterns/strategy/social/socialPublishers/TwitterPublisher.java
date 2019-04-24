package com.kodilla.patterns.strategy.social.socialPublishers;

public class TwitterPublisher implements SocialPublisher {
    public String share(){
        return "shared twitter content";
    }
}
