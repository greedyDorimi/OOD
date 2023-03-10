package designpatterns.chainofresponsibility;

public class DispenseChain10 implements DispenseChain {
    private DispenseChain chain;
    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        int amt = cur.getAmt();
        if(amt >= 10) {
            int remainder = amt % 10;
            System.out.println("Dispenser10 dispensing for Rupees: " + amt + " and dispensed Notes: " + amt/10);
            if(remainder != 0) {
                this.chain.dispense(new Currency(remainder));
            }
        } else {
            this.chain.dispense(cur);
        }
    }
}
