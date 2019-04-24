package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="PRODUCTS")
public class Product {
    private int id;
    private String name;
    private List<Item> items = new ArrayList<>();        ///

    public Product(String name) {
        this.name = name;
    }

    public Product(){

    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name="ID")
    public int getId() {
        return id;
    }

    @Column(name="NAME")
    public String getName() {
        return name;
    }

    @OneToMany(                               ///
            targetEntity = Item.class,
            mappedBy = "product",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )                                         ////
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }
}
