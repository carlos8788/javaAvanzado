public class CocheElectrico extends Coche {
    private int nivelBateria;

    public CocheElectrico(String marca, String modelo, int anio, int nivelBateria) {
        super(marca, modelo, anio);
        this.nivelBateria = nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void cargarBateria() {
        this.nivelBateria = 100;
    }
}