public class Bodega extends Equipaje {
    // Constantes
    private static final double CAPACIDAD = 8.0;

    // Constructores
    public Bodega(double peso, double tamanio) {
        peso = super.getPeso();
        tamanio = super.getTamanio();
    }

    public Bodega(double precioBase) {
        precioBase = super.getPrecioBase();
    }

    public Bodega() {
    }

    // Metodos
    public double calcularPrecio() {
        // Calculos
        double precioFinal = super.getPrecioBase() + (super.getPeso() * super.getTamanio() * CAPACIDAD);

        return precioFinal;
    }
    // getters/setters de ser necesarios
}
