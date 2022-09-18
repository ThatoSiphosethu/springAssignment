package edu.wctc.interfaces;

import edu.wctc.Sale;

public interface ShippingPolicy {
    void applyShipping(Sale sale);
}
