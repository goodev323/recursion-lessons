package dev.goo.invoice;

public class InvoiceItemNode {

    public Product product;
    public int quantity;
    public InvoiceItemNode next;

    public InvoiceItemNode(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        this.next = null;
    }

    public void setNext(InvoiceItemNode next) {
        this.next = next;
    }

    public Product getProduct() {
        return product;
    }

    public double getTotalPrice() {
        return this.product.getPrice() * this.quantity;
    }
}
