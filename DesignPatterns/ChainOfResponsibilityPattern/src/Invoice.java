public class Invoice {
    private int invoiceNo;
    private double tax;
    private double amount;

    public Invoice(int invoiceNo, double amount) {
        this.invoiceNo = invoiceNo;
        this.amount = amount;
    }

    protected void setTax(double tax) {
        this.tax = tax;
    }

    public int getInvoiceNo() {
        return invoiceNo;
    }

    public double getTax() {
        return tax;
    }

    public double getAmount() {
        return amount;
    }
}
