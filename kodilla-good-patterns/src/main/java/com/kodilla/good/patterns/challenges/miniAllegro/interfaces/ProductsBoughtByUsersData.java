package com.kodilla.good.patterns.challenges.miniAllegro.interfaces;

import com.kodilla.good.patterns.challenges.miniAllegro.User;
import com.kodilla.good.patterns.challenges.miniAllegro.products.Product;

import java.util.ArrayList;

public class ProductsBoughtByUsersData implements BoughtRespository{

    ArrayList<String> boughtProductsByUserList = new ArrayList<>();

    public void saveToDatabase(User user, Product product){
        String information = "User: " + user.getName() + " " + user.getSurname() + " bought " + product.getName() + " for " + product.getPrice() + " PLN";
        boughtProductsByUserList.add(information);
    }

    public ArrayList<String> getData() {
        ArrayList<String> copyOfData = new ArrayList<>(boughtProductsByUserList);
        return copyOfData;
    }
}
