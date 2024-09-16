package floodFill;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FloodFillTest {

    @Test
    void testFloodFill_simpleCase() {
        FloodFill floodFill = new FloodFill();
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int[][] expected = {{2,2,2},{2,2,0},{2,0,1}};
        assertArrayEquals(expected, floodFill.floodFill(image, 1, 1, 2));
    }

    @Test
    void testFloodFill_noChangeNeeded() {
        FloodFill floodFill = new FloodFill();
        int[][] image = {{0,0,0},{0,0,0}};
        int[][] expected = {{0,0,0},{0,0,0}};
        assertArrayEquals(expected, floodFill.floodFill(image, 0, 0, 0));
    }

    @Test
    void testFloodFill_singlePixelImage() {
        FloodFill floodFill = new FloodFill();
        int[][] image = {{1}};
        int[][] expected = {{2}};
        assertArrayEquals(expected, floodFill.floodFill(image, 0, 0, 2));
    }

    @Test
    void testFloodFill_edgePixel() {
        FloodFill floodFill = new FloodFill();
        int[][] image = {{1,1,1},{1,0,0},{1,0,1}};
        int[][] expected = {{2,2,2},{2,0,0},{2,0,1}};
        assertArrayEquals(expected, floodFill.floodFill(image, 0, 0, 2));
    }
}