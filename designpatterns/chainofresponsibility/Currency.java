package designpatterns.chainofresponsibility;

public class Currency {
    private int amt;

    public Currency(int amt) {
        this.amt = amt;
    }

    public int getAmt() {
        return amt;
    }
}
