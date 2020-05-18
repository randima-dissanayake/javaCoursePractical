public class TAX extends Handler{
    @Override
    public double applyTax(Invoice invoice) {
        return succesor.applyTax(invoice);
    }
}
