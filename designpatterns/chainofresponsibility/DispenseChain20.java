package designpatterns.chainofresponsibility;

public class DispenseChain20 implements DispenseChain{
    private DispenseChain chain;
    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        int amt = cur.getAmt();
        if(amt >= 20) {
            int remainder = amt % 20;
            System.out.println("Dispenser20 dispensing for Rupees: " + amt + " and dispensed Notes: " + amt/20);
            if(remainder != 0) {
                this.chain.dispense(new Currency(remainder));
            }
        } else {
            this.chain.dispense(cur);
        }
    }
}
