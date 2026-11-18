
package electronic.prog_6112_exam_st10456896;

public class PrintProduct {

    public void PrintProductReport(IProduct product) {

        System.out.println("PRODUCT SALES REPORT 2026");
        System.out.println();

        System.out.println("TOTAL PRODUCT SALES: "
                + product.GetTotalProductsSold());

        System.out.printf("AVERAGE PRODUCT SALES: %.0f%n",
                product.GetAverageProductsSold());

        System.out.println("MOST POPULAR PRODUCT: "
                + product.GetMostPopularProduct());
    }
}
