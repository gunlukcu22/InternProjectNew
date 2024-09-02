package com.semih.shopping;

import org.javamoney.moneta.Money;

public class Item {
    private String name;
    private String supplierName;
    private Money price;
    private Money priceBought;

    private static final Float TAX = 1.2f;

    public Item(String name, String supplierName, Money price, Money priceBought) {
        this.name = name;
        this.supplierName = supplierName;
        this.price = price;
        this.priceBought = priceBought;
    }

    public String getName() {
        return name;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public Money getPrice() {
        return price;
    }

    public Money getPriceBought() {
        return priceBought;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public void setPrice(Money price) {
        this.price = price;
    }

    public void setPriceBought(Money priceBought) {
        this.priceBought = priceBought;
    }

    public Money getTaxedPrice() {
        return price.multiply(TAX);
    }

    public Money getProfit() {
        return price.subtract(priceBought);
    }
}