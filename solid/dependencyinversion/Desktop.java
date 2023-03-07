package solid.dependencyinversion;

public class Desktop {
    private Monitor monitor;
    private QwertyKeyboard keyboard;

    /*
        Here, we are making Desktop class to be dependent on Monitor & QwertyKeyboard class.
     */
    public Desktop() {
        this.monitor = new Monitor();
        this.keyboard = new QwertyKeyboard();
    }
}
