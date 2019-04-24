package com.kodilla.good.patterns.challenges.miniAllegro;

import com.kodilla.good.patterns.challenges.miniAllegro.buyRequests.BuyRequestRetriever;
import com.kodilla.good.patterns.challenges.miniAllegro.interfaces.BuyServiceLogic;
import com.kodilla.good.patterns.challenges.miniAllegro.interfaces.ProductsBoughtByUsersData;
import com.kodilla.good.patterns.challenges.miniAllegro.interfaces.SMSService;

public class Application {

    public static void main(String[] args){

        BuyRequestRetriever buyRequestRetriever = new BuyRequestRetriever();

        ProductOrderService productOrderService = new ProductOrderService(new SMSService(), new BuyServiceLogic(), new ProductsBoughtByUsersData());
        productOrderService.process(buyRequestRetriever.retrieve());

    }
}
