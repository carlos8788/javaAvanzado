package ejercicios;

public class Main {
    public static void main(String[] args){
        AppSingleton app = AppSingleton.getInstance();
        AppSingleton app2 = AppSingleton.getInstance();

        System.out.println(app + " == " + app2);

    }
}
