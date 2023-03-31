package Observer;

public class Main {
    public static void main(String[] args){
        Emisor emisora = new Emisor();

        ReceptorTV tv = new ReceptorTV();
        ReceptorRadio radio = new ReceptorRadio();
        ReceptorSatelite satelite = new ReceptorSatelite();

        emisora.addReceptor(tv);
        emisora.addReceptor(radio);
        emisora.addReceptor(satelite);

        emisora.emite();
    }
}
