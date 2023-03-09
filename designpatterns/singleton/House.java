package designpatterns.singleton;

public class House {
    private int id;

    public House(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void printGuard(SecurityGuard guard) {
        System.out.println(guard);
    }
}
