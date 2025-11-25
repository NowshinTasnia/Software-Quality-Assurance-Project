package cse430;
public class TestCustomer{
    @Test
    public void testNoDiscountForLessThankTen() {
        double originalPrice = 10.0;
        int quantity = 5;
        double expectedPrice = originalPrice;
        double discountedPrice = applyDiscount(originalPrice, quantity);
        assertEquals(expectedPrice, discountedPrice, 0.01);
    }
}