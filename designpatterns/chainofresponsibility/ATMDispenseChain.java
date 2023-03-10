package designpatterns.chainofresponsibility;

public class ATMDispenseChain {
    private DispenseChain chain;

    public ATMDispenseChain() {
        this.chain = new DispenseChain50();
        DispenseChain c2 = new DispenseChain20();
        DispenseChain c3 = new DispenseChain10();
        chain.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public DispenseChain getChain() {
        return chain;
    }

    public void setChain(DispenseChain chain) {
        this.chain = chain;
    }
}
