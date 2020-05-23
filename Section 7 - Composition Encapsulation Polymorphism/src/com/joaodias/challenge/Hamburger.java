package com.joaodias.challenge;

import java.util.HashMap;
import java.util.Map;

public class Hamburger {
    private String name;
    private String breadRollType;
    private String meat;
    private Double basePrice;

    private Map<String, Double> baseAdditionals;

    public Hamburger(String name, String breadRollType, String meat, Double basePrice) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePrice = basePrice;
        baseAdditionals = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public Double getBasePrice() {
        return basePrice;
    }

    public Map<String, Double> getBaseAdditionals() {
        return baseAdditionals;
    }

    public Double getFinalPrice() {
        Double price = getBasePrice();
        System.out.println("Base Price of: " + price);
        for (String item : baseAdditionals.keySet()) {
            System.out.println(" + " + item + " : " + baseAdditionals.get(item));
            price += baseAdditionals.get(item);
        }
        System.out.println("==================");
        System.out.println(String.format("Total : %.2f", price));
        return price;
    }

    public void addBaseItem(String itemName, Double itemPrice) {
        if (baseAdditionals.keySet().size() == 4) {
            System.out.println("You've reach maximum base item capacity");
        } else {
            if (itemPrice <= 0) {
                System.out.println("Please insert a valid price");
            } else {
                baseAdditionals.put(itemName, itemPrice);
            }
        }
    }
}
