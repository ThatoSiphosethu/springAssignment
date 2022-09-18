package edu.wctc;

import edu.wctc.interfaces.ShippingPolicy;

public class FreeShipping implements ShippingPolicy {

    @Override
    public void applyShipping(Sale sale) {
        if(sale.getAmount() >= 10)
        {
            sale.setShipping(0);
        }
        else {
            sale.setShipping(sale.getAmount() * 0.20);
        }
    }
}