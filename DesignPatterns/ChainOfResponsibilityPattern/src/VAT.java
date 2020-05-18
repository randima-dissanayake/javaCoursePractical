public class VAT extends Handler{
    @Override
    public double applyTax(Invoice invoice) {
        double x = invoice.getAmount()*0.01;
        invoice.setTax(x);
        System.out.println("VAT applied = " +x);
        if(invoice.getAmount()<=100){

            return invoice.getTax();
        } else{

            return succesor.applyTax(invoice);

        }
    }
}
