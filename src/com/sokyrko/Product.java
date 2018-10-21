package com.sokyrko;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Product extends Inventory {

protected BigDecimal price;
protected boolean available;
protected LocalDate saledDate;
protected LocalDate createdDate;

    public Product(BigDecimal price) {
        this.price = price;
        this.available = true;
        this.createdDate = LocalDate.now();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public LocalDate getSaledDate() {
        return saledDate;
    }

    public void setSaledDate(LocalDate saledDate) {
        this.saledDate = saledDate;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", available=" + available +
                ", saledDate=" + saledDate +
                ", createdDate=" + createdDate +
                '}';
    }
}
