package bestTimeToBuyAndSellStock;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {

    @Test
    void testExample1() {
        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
        int[] prices = {7, 1, 5, 3, 6, 4};
        assertEquals(5, solution.maxProfit(prices));
    }

    @Test
    void testExample2() {
        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
        int[] prices = {7, 6, 4, 3, 1};
        assertEquals(0, solution.maxProfit(prices));
    }

    @Test
    void testSinglePrice() {
        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
        int[] prices = {5};
        assertEquals(0, solution.maxProfit(prices));
    }

    @Test
    void testIncreasingPrices() {
        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
        int[] prices = {1, 2, 3, 4, 5};
        assertEquals(4, solution.maxProfit(prices));
    }

    @Test
    void testDecreasingPrices() {
        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
        int[] prices = {5, 4, 3, 2, 1};
        assertEquals(0, solution.maxProfit(prices));
    }

    @Test
    void testComplexCase() {
        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
        int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};
        assertEquals(4, solution.maxProfit(prices));
    }
}
