package com.sokyrko;

import java.math.BigDecimal;
import java.util.List;

public class Device extends Product {

    private List<String> parametrs;

    public Device(BigDecimal price, List<String> parametrs) {
        super(price);
        this.parametrs = parametrs;
    }

    @Override
    public String toString() {
        return "Device{" +
                "parametrs=" + parametrs +
                ", price=" + price +
                ", available=" + available +
                ", saledDate=" + saledDate +
                ", createdDate=" + createdDate +
                '}';
    }
}
