package CreationalPattern;

public class SingletonTest {

    public static void main(String[] args) {

        AppConfiguration app = AppConfiguration.getInstance();
        app.setMessage("Yeah!!!");
        System.out.println(app.getMessage());

        AppConfiguration app2 = AppConfiguration.getInstance();
        System.out.println(app2.getMessage());
    }
}
