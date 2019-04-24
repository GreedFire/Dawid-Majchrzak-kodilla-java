package com.kodilla.patterns.strategy.social.users;

import com.kodilla.patterns.strategy.social.socialPublishers.SnapchatPublisher;

public class YGeneration extends User {
    public YGeneration(String userName) {
        super(userName);
        this.socialPublisher = new SnapchatPublisher();
    }
}
