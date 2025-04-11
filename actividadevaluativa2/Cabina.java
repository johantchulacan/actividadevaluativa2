public class Cabina extends Equipaje {
    // Constantes
    private static final int TIEMPO = 2;

    // Constructores
    public Cabina(double peso, double tamanio) {
        peso = super.getPeso();
        tamanio = super.getTamanio();
    }

    public Cabina(double precioBase) {
        precioBase = super.getPrecioBase();
    }

    public Cabina() {
    }

    // Metodos
    public double calcularPrecio() {
        // Calculos
        double precioFinal = super.getPrecioBase() + (super.getPeso() * super.getTamanio() * TIEMPO);

        return precioFinal;
    }
    // getters/setters de ser necesarios
}
