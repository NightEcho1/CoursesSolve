package org.solutions;

public class ProductWarehouse extends Warehouse {
    private String productName;

    public ProductWarehouse(String productName, double amount) {
        super(amount);
        this.productName = productName;
    }

    public String getName() {
        return this.productName;
    }

    public void setName(String newName) {
        this.productName = newName;
    }

    @Override
    public String toString() {
        return this.productName + ": " + super.toString();
    }
}
