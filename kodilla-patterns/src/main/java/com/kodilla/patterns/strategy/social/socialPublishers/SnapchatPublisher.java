package com.kodilla.patterns.strategy.social.socialPublishers;

public class SnapchatPublisher implements SocialPublisher {
    public String share(){
        return "Shared snapchat content";
    }
}
