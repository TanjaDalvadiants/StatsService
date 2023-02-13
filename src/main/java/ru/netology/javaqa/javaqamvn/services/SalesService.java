package ru.netology.javaqa.javaqamvn.services;

public class SalesService {
    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int SummarySales(int[] sales) {
        int summarySales = 0;// общая сумма продаж в массиве
        for (int sale : sales) {
            summarySales = sale + summarySales;
        }
        return summarySales;
    }

    public int AverageSales(int[] sales) {
        int summarySales = 0;// общая сумма продаж в массиве
        int averageSales = 0;// средняя сумма продаж в массиве
        for (int sale : sales) {
            summarySales = sale + summarySales;
        }
        averageSales = summarySales / sales.length;

        return averageSales;
    }

    public int SalesBelowAverage(int[] sales) {
        int summarySales = 0;// общая сумма продаж в массиве
        int averageSales = 0;// средняя сумма продаж в массиве
        for (int sale : sales) {
            summarySales = sale + summarySales;
        }
        averageSales = summarySales / sales.length;

        int countOfMonth = 0;//количество месяцев с продажами ниже средних
        for (int sale : sales) {
            if (sale < averageSales) {
                countOfMonth = countOfMonth + 1;
            }
        }
        return countOfMonth;
    }

    public int SalesUpperAverage(int[] sales) {
        int summarySales = 0;// общая сумма продаж в массиве
        int averageSales = 0;// средняя сумма продаж в массиве
        for (int sale : sales) {
            summarySales = sale + summarySales;
        }
        averageSales = summarySales / sales.length;

        int countOfMonth = 0;
        for (int sale : sales) {
            if (sale > averageSales) {
                countOfMonth = countOfMonth + 1;//количество месяцев с продажами выше средних
            }
        }
        return countOfMonth;
    }
}
