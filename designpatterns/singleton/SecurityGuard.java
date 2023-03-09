package designpatterns.singleton;

public class SecurityGuard {
    private String name;
    private static SecurityGuard INSTANCE = null;

    private SecurityGuard() {
        this.name = "Satish";
    }

    public static synchronized SecurityGuard getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SecurityGuard();
        }
        return INSTANCE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
