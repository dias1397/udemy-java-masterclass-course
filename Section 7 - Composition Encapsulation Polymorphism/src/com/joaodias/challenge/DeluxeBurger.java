package com.joaodias.challenge;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe", "White", "Pork", 4.99);
        super.addBaseItem("Chips", 2.99);
        super.addBaseItem("Drink", 1.99);
    }

    @Override
    public void addBaseItem(String itemName, Double itemPrice) {
        System.out.println("No additional items can be added to this hamburguer");
    }
}
