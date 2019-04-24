package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Bigmac {
    private final String bun;
    private final int burgers;
    private final String sauce;
    private final ArrayList<String> ingredients;

    private final static String SESAME = "sesame";
    private final static String ORDINARY = "ordinary";
    private final static String STANDARD = "standard";
    private final static String THOUSANDISLAND = "1000 island";
    private final static String BARBECUE = "barbecue";
    private final static List<String> allowedIngredients = Arrays.asList("lettuce", "onion", "bacon", "cucumber", "chilli pepper", "mushrooms", "shrimp", "cheese");

    private Bigmac(String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bigmac bigmac = (Bigmac) o;
        return burgers == bigmac.burgers &&
                Objects.equals(bun, bigmac.bun) &&
                Objects.equals(sauce, bigmac.sauce) &&
                Objects.equals(ingredients, bigmac.ingredients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bun, burgers, sauce, ingredients);
    }

    public static class BigmacBuilder {
        private String bun;
        private int burgers;
        private String sauce;
        private ArrayList<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun){
            if(bun.equals(SESAME) || bun.equals(ORDINARY))
                this.bun = bun;
            else throw new IllegalStateException("Wrong type of bun");
            return this;
        }

        public BigmacBuilder burgers(int count){
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce){
            if(sauce.equals(STANDARD) || sauce.equals(THOUSANDISLAND) || sauce.equals(BARBECUE))
                this.sauce = sauce;
            else throw new IllegalStateException("Wrong type of sauce");
            return this;
        }

        public BigmacBuilder ingredient(String ingredient){
            boolean isOk = false;
            for(String allowedIngredient : allowedIngredients){
                if(allowedIngredient.equals(ingredient))
                    isOk = true;
            }
            if(isOk)
                this.ingredients.add(ingredient);
            else
                throw new IllegalStateException("Wrong ingredient");
            return this;
        }

        public Bigmac build(){

            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
