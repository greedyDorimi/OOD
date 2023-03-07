package solid.dependencyinversion;

public class Desktop1 {
    private Monitor monitor;

    private QwertyKeyboard keyboard;

    /*
        Now, Desktop is not dependent on Monitor & QwertyKeyboard.
        But if In future we need more keyboards then, we would need to unnecessarily add keyboard several times.
        To avoid this we need abstraction here, and we will make keyboard generic.
     */
    public Desktop1(Monitor monitor, QwertyKeyboard keyboard) {
        this.monitor = monitor;
        this.keyboard = keyboard;
    }
}
