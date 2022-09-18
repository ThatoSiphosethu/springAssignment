package edu.wctc;

import edu.wctc.interfaces.SalesReport;

import java.util.List;

public class DetailSalesReport implements SalesReport {

    @Override
    public void generateReport(List<Sale> saleList) {

        System.out.printf("%-30s%-30s%-30s%-30s%-30s \n","Customer","Country","Amount","Tax","Shipping");

        for(Sale sale : saleList) {
            String format = "%-30s%-30s%-30s%-30s%-30s \n";

            System.out.printf(format, sale.getCustomer(), sale.getCountry(), sale.getAmount(), sale.getTax(), sale.getShipping());
        }
    }
}