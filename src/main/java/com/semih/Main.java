package com.semih;

import com.semih.shopping.Item;
import com.semih.shopping.ShoppingCart;
import org.javamoney.moneta.Money;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("item1", "y", Money.of(10, "USD"), Money.of(5, "USD")));
        cart.addItem(new Item("item2", "y", Money.of(15, "USD"), Money.of(10, "USD")));
        cart.addItem(new Item("item3", "y", Money.of(20, "USD"), Money.of(15, "USD")));
        cart.addItem(new Item("item4", "y", Money.of(25, "USD"), Money.of(20, "USD")));
        cart.addItem(new Item("item5", "y", Money.of(30, "USD"), Money.of(25, "USD")));
        cart.addItem(new Item("item6", "y", Money.of(35, "USD"), Money.of(30, "USD")));
        System.out.println("Total Price: " + cart.getTotalPrice());
        List<Item> items = cart.getItems();
        for (Item item : items) {
            StringBuilder builder = new StringBuilder();
            builder.append(item.getName())
                    .append(" | ")
                    .append(item.getTaxedPrice())
                    .append(" | ")
                    .append(item.getProfit());
            builder.append(" | ");
            builder.append(item.getPriceBought());
            System.out.println(builder.toString());
        }
    }
}