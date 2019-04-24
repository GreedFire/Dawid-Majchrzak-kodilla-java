package com.kodilla.good.patterns.challenges.food2Door.suppliers;

import com.kodilla.good.patterns.challenges.food2Door.things.OrderDto;

public interface OrderService {
    boolean process(OrderDto orderDto);
}
