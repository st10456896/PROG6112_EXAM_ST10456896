/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class ProductCalculationsTest {
    
    @Test
    public void GetVat_WithValidData_ReturnsCorrectValue() {

        ProductCalculations calculations = new ProductCalculations(1000.00);

        double expected = 150.00;

        double actual = calculations.GetVat();

        assertEquals(expected, Math.round(actual * 100.0) / 100.0);
    }
}
