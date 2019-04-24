package com.kodilla.good.patterns.challenges.food2Door.things;

public class InformationService {
    private OrderDto orderDto;

    public InformationService(OrderDto orderDto) {
        this.orderDto = orderDto;
    }

    public void requestInformation(boolean requestAcctepted){
        if(requestAcctepted)
            System.out.println("Order number: " + orderDto.getOrder().getNumberOfOrder() + " from " + orderDto.getSupplier().getName() + " was accepted");
        else
            System.out.println("Order number: " + orderDto.getOrder().getNumberOfOrder() + " from " + orderDto.getSupplier().getName() + " wasn't accepted");

        for(Product product : orderDto.getOrder().getProductsList()){
            System.out.println(product);
        }

        System.out.println("");
    }
}
