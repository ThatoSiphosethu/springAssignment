package edu.wctc;

import edu.wctc.interfaces.ShippingPolicy;

public class ShippingRate implements ShippingPolicy {
    @Override
    public void applyShipping(Sale sale) {
        sale.setShipping(sale.getAmount() * 0.20);
    }
}