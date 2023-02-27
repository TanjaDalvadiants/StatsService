package ru.netology.javaqa.javaqamvn.services;

import junit.framework.TestCase;
import org.junit.Test;
//import ru.netology.javaqa.javaqamvn.services.SalesService;


public class SalesServiceTest {
    @Test

    public void shouldFindMinSale() {
        SalesService service = new SalesService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinSale = 9;
        int actualMinSale = service.minSales(sales);


        TestCase Assertions = null;
        TestCase.assertEquals(expectedMinSale, actualMinSale);
    }

    @Test

    public void shouldFindMaxSale() {
        SalesService service = new SalesService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxSale = 8;
        int actualMaxSale = service.maxSales(sales);


        TestCase Assertions = null;
        TestCase.assertEquals(expectedMaxSale, actualMaxSale);
    }

    @Test

    public void shouldFindSummarySales() {
        SalesService service = new SalesService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSummarySales = 180;
        int actualSummmarySales = service.SummarySales(sales);


        TestCase Assertions = null;
        TestCase.assertEquals(expectedSummarySales, actualSummmarySales);
    }

    @Test

    public void shouldFindAverageSales() {
        SalesService service = new SalesService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverageSales = 15;
        int actualAverageSales = service.AverageSales(sales);


        TestCase.assertEquals(expectedAverageSales, actualAverageSales);
    }

    @Test

    public void shouldFindSalesBelowAverage() {
        SalesService service = new SalesService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSalesBelowAverage = 5;
        int actualSalesBelowAverage = service.SalesBelowAverage(sales);


        TestCase Assertions = null;
        TestCase.assertEquals(expectedSalesBelowAverage, actualSalesBelowAverage);
    }

    @Test

    public void shouldFindSalesUpperAverage() {
        SalesService service = new SalesService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSalesUpperAverage = 5;
        int actualSalesUpperAverage = service.SalesUpperAverage(sales);


        TestCase Assertions = null;
        TestCase.assertEquals(expectedSalesUpperAverage, actualSalesUpperAverage);
    }
}


