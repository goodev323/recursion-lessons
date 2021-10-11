package dev.goo.invoice;

public class Invoice {
    String invoiceNumber; // 請求書番号。"UC-"の後に10桁の数字が続くとします。
    String invoiceDate; // 請求書が作成された日付。
    String company; // 会社名
    String companyAddress; // 会社の住所
    String billToName; // 請求書先の名前
    String billToAddress; // 請求書先の住所
    InvoiceItemNode invoiceItemHeadNode; // 購入したアイテムのリストの開始を表す

    public double amountDue(boolean taxes) {
        InvoiceItemNode currentNode = invoiceItemHeadNode;
        double total = 0;
        while(currentNode != null) {
            double price = invoiceItemHeadNode.getTotalPrice();
            if(taxes) {
                price *= 1.1;
            }
            total += price;
        }
        return total;
    }

    public void printBuyingItems() {

    }
}
