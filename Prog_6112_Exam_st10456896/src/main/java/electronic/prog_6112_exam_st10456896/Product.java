
package electronic.prog_6112_exam_st10456896;

// Implements the IProduct interface.
public class Product implements IProduct {

    // Single-dimensional array containing product names.
    private String[] productNames = {
        "Cozy Nights Monarch",
        "Restonic Barbados",
        "Sealy Phuker"
    };

    // Two-dimensional array containing monthly product sales.
    private int[][] productSold;

    public Product() {
        productSold = new int[][] {
            {25, 18, 20},
            {15, 10, 12},
            {18, 15, 20}
        };
    }

    public Product(int[][] productSold) {
        this.productSold = productSold;
    }

    // Calculations
    @Override
    public int GetTotalProductsSold() {

        int total = 0;

        for (int[] product : productSold) {
            for (int sale : product) {
                total += sale;
            }
        }

        return total;
    }

    // Calculations
    @Override
    public double GetAverageProductsSold() {

        int total = 0;
        int count = 0;

        for (int[] product : productSold) {
            for (int sale : product) {
                total += sale;
                count++;
            }
        }

        if (count == 0) {
            return 0;
        }

        return (double) total / count;
    }

    @Override
    public String GetMostPopularProduct() {

        int highestSale = productSold[0][0];
        int popularProductIndex = 0;

        for (int i = 0; i < productSold.length; i++) {

            for (int sale : productSold[i]) {

                if (sale > highestSale) {
                    highestSale = sale;
                    popularProductIndex = i;
                }
            }
        }

        return productNames[popularProductIndex]
                + " (" + highestSale + ")";
    }
}
