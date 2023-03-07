package solid.dependencyinversion;

public class Desktop2 {
    private Monitor monitor;
    private Keyboard keyboard;

    public Desktop2(Monitor monitor, Keyboard keyboard) {
        this.monitor = monitor;
        this.keyboard = keyboard;
    }
}
