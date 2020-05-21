public class NBT extends Handler{
    @Override
    public double applyTax(Invoice invoice) {
        double x = invoice.getAmount()*0.03;
        invoice.setTax(invoice.getTax()+x);
        System.out.println("NBT applied = "+x);
        if((invoice.getAmount()>=100) && (invoice.getAmount()<=1000)){

            return invoice.getTax();
        } else{

            return succesor.applyTax(invoice);
        }
    }
}
