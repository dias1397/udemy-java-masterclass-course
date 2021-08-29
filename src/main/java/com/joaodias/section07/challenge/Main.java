package com.joaodias.section07.challenge;

public class Main {

    public static void main(String[] args) {
        Hamburger base = new Hamburger("base", "standard", "beef", 2.99);
        System.out.println(base.getName());
        base.addBaseItem("Lettuce", 0.99);
        base.addBaseItem("Tomato", 0.59);
        base.addBaseItem("Cheese", 1.19);
        base.addBaseItem("Carrot", 0.89);
        base.addBaseItem("Bacon", 3.99);
        base.getFinalPrice();

        HealthyBurger healthy = new HealthyBurger("chicken", 3.99);
        System.out.println(healthy.getName());
        healthy.addBaseItem("Lettuce", 0.99);
        healthy.addBaseItem("Tomato", 0.59);
        healthy.addBaseItem("Cheese", 1.19);
        healthy.addBaseItem("Carrot", 0.89);
        healthy.addExtraItem("Corn", 0.89);
        healthy.addExtraItem("Onion", 3.99);
        healthy.getFinalPrice();

        DeluxeBurger deluxe = new DeluxeBurger();
        System.out.println(deluxe.getName());
        deluxe.addBaseItem("Cheese", 1.00);
        deluxe.getFinalPrice();
    }

}
