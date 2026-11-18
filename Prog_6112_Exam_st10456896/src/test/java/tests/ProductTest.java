
package tests;

import electronic.prog_6112_exam_st10456896.Product;

public class ProductTest {

    private final Product product = new Product(new int[][] {
        {25, 18, 20},
        {15, 10, 12},
        {18, 15, 20}
    });

    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {

        int expected = 153;

        int actual = product.GetTotalProductsSold();

        assertEquals(expected, actual);
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {

        double expected = 17.0;

        double actual = product.GetAverageProductsSold();

        assertEquals(expected, actual, 0.01);
    }
}
