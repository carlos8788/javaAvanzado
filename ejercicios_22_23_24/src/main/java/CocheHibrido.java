public class CocheHibrido extends Coche {
    private int nivelBateria;
    private int nivelCombustible;

    public CocheHibrido(String marca, String modelo, int anio, int nivelBateria, int nivelCombustible) {
        super(marca, modelo, anio);
        this.nivelBateria = nivelBateria;
        this.nivelCombustible = nivelCombustible;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void cargarBateria() {
        this.nivelBateria = 100;
    }

    public int getNivelCombustible() {
        return nivelCombustible;
    }

    public void rellenarTanque() {
        this.nivelCombustible = 100;
    }
}