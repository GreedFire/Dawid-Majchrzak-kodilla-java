package com.kodilla.good.patterns.challenges.miniAllegro;

import com.kodilla.good.patterns.challenges.miniAllegro.buyRequests.BuyRequest;
import com.kodilla.good.patterns.challenges.miniAllegro.interfaces.BoughtRespository;
import com.kodilla.good.patterns.challenges.miniAllegro.interfaces.BuyService;
import com.kodilla.good.patterns.challenges.miniAllegro.interfaces.InformationService;

public class ProductOrderService {
    private InformationService informationService;
    private BuyService buyService;
    private BoughtRespository boughtRespository;

    public ProductOrderService(final InformationService informationService, final BuyService buyService, final BoughtRespository boughtRespository) {
        this.informationService = informationService;
        this.buyService = buyService;
        this.boughtRespository = boughtRespository;
    }

    public BuyDto process(final BuyRequest buyRequest){
        boolean isBought = buyService.buy(buyRequest.getUser(), buyRequest.getProduct());

        if(isBought){
            informationService.inform(buyRequest.getProduct(), buyRequest.getBuyDate());
            boughtRespository.saveToDatabase(buyRequest.getUser(), buyRequest.getProduct());
            return new BuyDto(buyRequest.getUser(), buyRequest.getProduct(), true);
        } else{
            return new BuyDto(buyRequest.getUser(), buyRequest.getProduct(), false);
        }

    }
}
