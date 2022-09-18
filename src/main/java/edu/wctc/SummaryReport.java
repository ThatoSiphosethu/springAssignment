package edu.wctc;

import edu.wctc.interfaces.SalesReport;

import java.util.HashMap;
import java.util.List;

public class SummaryReport implements SalesReport {
    @Override
    public void generateReport(List<Sale> saleList) {

        HashMap<String, Sale> saleCountry = new HashMap<String, Sale>();

        for (Sale newSale : saleList) {
            if (!saleCountry.containsKey(newSale.getCountry())) {
                Sale sale = new Sale(newSale.getCountry());
                saleCountry.put(sale.getCountry(), sale);
            }
            Sale customer = saleCountry.get(newSale.getCountry());
            customer.setAmount(customer.getAmount() + newSale.getAmount());
            customer.setTax(customer.getTax() + newSale.getTax());
            customer.setShipping(customer.getShipping() + newSale.getShipping());

        }

        System.out.printf("%-25s%-25s%-25s%-25s\n","Country","Amount","Tax","Shipping");
        for (Sale sale : saleCountry.values()) {
            System.out.printf("%-25s%-25s%-25s%-25s\n",sale.getCountry(),sale.getAmount(),sale.getTax(),sale.getShipping()
            );
        }
    }
}