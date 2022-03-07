package CreationalPattern;

public class AppConfiguration {

    private static AppConfiguration instance;
    private String message = "hello";

    private AppConfiguration() { }

    public static AppConfiguration getInstance() {
        if (instance == null) {
            instance = new AppConfiguration();
        }
        return instance;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
