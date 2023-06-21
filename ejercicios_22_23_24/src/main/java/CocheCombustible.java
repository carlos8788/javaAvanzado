public class CocheCombustible extends Coche {
    private int nivelCombustible;

    public CocheCombustible(String marca, String modelo, int anio, int nivelCombustible) {
        super(marca, modelo, anio);
        this.nivelCombustible = nivelCombustible;
    }

    public int getNivelCombustible() {
        return nivelCombustible;
    }

    public void rellenarTanque() {
        this.nivelCombustible = 100;
    }
}
