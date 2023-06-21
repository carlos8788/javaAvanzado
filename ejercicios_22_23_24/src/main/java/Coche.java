
public class Coche implements CarroInterface {
    private String marca;
    private String modelo;
    private int ano;
    private boolean encendido;

    public Coche(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.encendido = false;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public boolean estaEncendido() {
        return encendido;
    }


    public void encender() {
        this.encendido = true;
    }


    public void apagar() {
        this.encendido = false;
    }
}


