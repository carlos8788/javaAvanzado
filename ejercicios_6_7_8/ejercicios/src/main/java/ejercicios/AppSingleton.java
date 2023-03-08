package ejercicios;

public class AppSingleton {
    private static AppSingleton app;

    private AppSingleton() {}

    public static AppSingleton getInstance() {
        if (app == null) {
            app = new AppSingleton();
        }
        return app;
    }

}
