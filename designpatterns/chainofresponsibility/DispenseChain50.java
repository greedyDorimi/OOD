package designpatterns.chainofresponsibility;

public class DispenseChain50 implements DispenseChain {
    private DispenseChain chain;
    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        int amt = cur.getAmt();
        if(amt >= 50) {
            int remainder = amt % 50;
            System.out.println("Dispenser50 dispensing for Rupees: " + amt + " and dispensed Notes: " + amt/50);
            if(remainder != 0) {
                this.chain.dispense(new Currency(remainder));
            }
        } else {
            this.chain.dispense(cur);
        }
    }
}
