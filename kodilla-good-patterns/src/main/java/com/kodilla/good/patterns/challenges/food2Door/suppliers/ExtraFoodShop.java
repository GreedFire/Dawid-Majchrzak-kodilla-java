package com.kodilla.good.patterns.challenges.food2Door.suppliers;

import com.kodilla.good.patterns.challenges.food2Door.things.InformationService;
import com.kodilla.good.patterns.challenges.food2Door.things.OrderDto;
import com.kodilla.good.patterns.challenges.food2Door.things.Product;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class ExtraFoodShop implements OrderService {

    public boolean process(OrderDto orderDto){
        boolean result = false;
        ArrayList<Product> productList = orderDto.getOrder().getProductsList();
        InformationService informationService = new InformationService(orderDto);

        if(orderDto.getSupplier().getName().equals("ExtraFoodShop")){
            double quantityOfAllProducts = IntStream.range(0, productList.size())
                    .map(n -> productList.get(n).getWeightOrQuantity())
                    .sum();
            if(quantityOfAllProducts >= 100)
                result = true;
        }
        informationService.requestInformation(result);
        return result;
    }
}
