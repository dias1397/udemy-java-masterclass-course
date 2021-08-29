package com.joaodias.section7.challenge;

import java.util.HashMap;
import java.util.Map;

public class HealthyBurger extends Hamburger{
    private Map<String, Double> extrasAdditionals;

    public HealthyBurger( String meat, Double basePrice) {
        super("Healthy Burguer", "Brown Rye", meat, basePrice);
        extrasAdditionals = new HashMap<>();
    }

    @Override
    public Double getFinalPrice() {
        Double price = getBasePrice();
        System.out.println("Base Price of: " + price);
        for (String item : getBaseAdditionals().keySet()) {
            System.out.println(" + " + item + " : " + getBaseAdditionals().get(item));
            price += getBaseAdditionals().get(item);
        }
        for (String item : extrasAdditionals.keySet()) {
            System.out.println(" + " + item + " : " + extrasAdditionals.get(item));
            price += extrasAdditionals.get(item);
        }
        System.out.println("==================");
        System.out.println(String.format("Total : %.2f", price));
        return price;
    }

    public void addExtraItem(String itemName, Double itemPrice) {
        if (extrasAdditionals.keySet().size() == 2) {
            System.out.println("You've reach maximum extra items capacity");
        } else {
            if (itemPrice <= 0) {
                System.out.println("Please insert a valid price");
            } else {
                extrasAdditionals.put(itemName, itemPrice);
            }
        }
    }
}
