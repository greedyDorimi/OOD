package solid.liskovprinciple;

public class EngineNotFoundException extends Exception {
    EngineNotFoundException(String message) {
        super(message);
    }
}
