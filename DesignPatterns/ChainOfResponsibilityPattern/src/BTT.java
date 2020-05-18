public class BTT extends Handler{
    @Override
    public double applyTax(Invoice invoice) {
        double x = invoice.getAmount()*0.05;
        invoice.setTax(invoice.getTax()+x);
        System.out.println("BTT applied = " + x);

        return invoice.getTax();
    }
}
