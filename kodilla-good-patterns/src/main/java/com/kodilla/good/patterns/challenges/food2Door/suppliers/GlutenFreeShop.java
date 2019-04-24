package com.kodilla.good.patterns.challenges.food2Door.suppliers;

import com.kodilla.good.patterns.challenges.food2Door.things.InformationService;
import com.kodilla.good.patterns.challenges.food2Door.things.OrderDto;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class GlutenFreeShop {

    public boolean process(OrderDto orderDto){
        boolean result = false;
        InformationService informationService = new InformationService(orderDto);

        LocalDate orderDate = orderDto.getOrder().getDate();
        LocalDate currentDate = LocalDate.now();

        if(orderDto.getSupplier().getName().equals("GlutenFreeShop") && DAYS.between(orderDate, currentDate) < 5){
            result = true;
        }

        informationService.requestInformation(result);
        return result;
    }
}
