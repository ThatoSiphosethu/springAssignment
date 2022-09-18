package edu.wctc;

import edu.wctc.interfaces.SalesInput;
import edu.wctc.interfaces.SalesReport;
import edu.wctc.interfaces.ShippingPolicy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "edu.wctc")
public class MyApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MyApp.class);
        context.refresh();
        ((SalesProcessor)context.getBean("salesProcessor")).processSales();
    }

    // Uncomment to run different options
    @Bean
    public SalesInput reader() {
        return new FileReader();
    }
//    @Bean
//    public SalesInput reader() {
//        return new CommandLineProvider();
//    }

    @Bean
    public SalesReport report() {
        return new DetailSalesReport();
    }
//    @Bean
//    public SalesReport report() {
//        return new SummaryReport();
//    }

    @Bean
    public ShippingPolicy ship() {
        return new FreeShipping();
    }
}