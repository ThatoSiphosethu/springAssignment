package edu.wctc;

import edu.wctc.interfaces.SalesInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Actions implements SalesInput {

    @Override
    public List<Sale> getSales() {
        List<Sale> list = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        String response = "y";

        while (response.equalsIgnoreCase("y")) {

            System.out.println("Enter customer info: ");
            String customer = keyboard.nextLine();

            System.out.println("Enter author: ");
            String country = keyboard.nextLine();

            System.out.println("Enter year: ");
            int amount = Integer.parseInt(keyboard.nextLine());

            // shipping
            System.out.println("Enter year: ");
            int shipping = Integer.parseInt(keyboard.nextLine());

            // create article
            Sale sale = new Sale();
            sale.setCustomer(customer);
            sale.setCountry(country);
            sale.setAmount(amount);
            sale.setShipping(shipping);

            // add to list
            list.add(sale);

            // more sales
            System.out.println("More sales? (y/n) ");
            response = keyboard.nextLine();
        }

        return list;
    }
}