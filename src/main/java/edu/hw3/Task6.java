package edu.hw3;

import java.util.PriorityQueue;

public class Task6 {
    private Task6() {
    }

    interface StockMarket {
        void add(Stock stock);

        void remove(Stock stock);

        Stock mostValuableStock();
    }

    public static class StockMarketImpl implements StockMarket {
        private PriorityQueue<Stock> stockQueue;

        public StockMarketImpl() {
            stockQueue = new PriorityQueue<>((s1, s2) -> s2.getPrice() - s1.getPrice());
        }

        @Override
        public void add(Stock stock) {
            stockQueue.add(stock);
        }

        @Override
        public void remove(Stock stock) {
            stockQueue.remove(stock);
        }

        @Override
        public Stock mostValuableStock() {
            return stockQueue.peek();
        }
    }

    public static class Stock {
        private String name;
        private int price;

        public Stock(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }
    }
}
