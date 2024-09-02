package com.semih.shopping;

import org.javamoney.moneta.Money;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ShoppingCart {
    private List<Item> items;

    public ShoppingCart() {
        items = new ArrayList<Item>();
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public Money getTotalPrice() {
        Money totalPrice = Money.of(0, "USD");
        for (Item item : items) {
            totalPrice = totalPrice.add(item.getTaxedPrice());
        }
        return totalPrice;
    }
}