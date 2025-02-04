package day02.assignment;

public abstract class Payment {
    protected String shopName;
    protected String productName;
    protected Long productPrice;

    public Payment(String shopName, String productName, Long productPrice) {
        this.shopName = shopName;
        this.productName = productName;
        this.productPrice = productPrice;
    }
}
