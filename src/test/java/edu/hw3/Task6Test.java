package edu.hw3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task6Test {
    @Test
    @DisplayName("Добавление и самая дорогая")
    void testAddAndMostValuableStock() {
        Task6.StockMarketImpl stockMarket = new Task6.StockMarketImpl();
        Task6.Stock stock1 = new Task6.Stock("Stock 1", 100);
        Task6.Stock stock2 = new Task6.Stock("Stock 2", 200);
        Task6.Stock stock3 = new Task6.Stock("Stock 3", 150);
        stockMarket.add(stock1);
        stockMarket.add(stock2);
        stockMarket.add(stock3);

        assertEquals(stock2, stockMarket.mostValuableStock());
    }

    @Test
    @DisplayName("Добавление, удаление и самая дорогая")
    public void testAddAndRemoveAndMostValuableStock() {
        Task6.StockMarketImpl stockMarket = new Task6.StockMarketImpl();
        Task6.Stock stock1 = new Task6.Stock("Stock 1", 100);
        Task6.Stock stock2 = new Task6.Stock("Stock 2", 200);
        stockMarket.add(stock1);
        stockMarket.add(stock2);
        stockMarket.remove(stock2);

        assertEquals(stock1, stockMarket.mostValuableStock());
    }
}


