public class Cabina extends Equipaje {
    // Constantes
    private static final int TIEMPO = 2;

    // Constructores
    public Cabina(double peso, double tamanio) {
        super(peso, tamanio);
    }

    public Cabina(double precioBase) {
        super(precioBase);
    }

    public Cabina() {
        super();
    }

    // Metodos
    public double calcularPrecio() {
        // Calculos
        double precioFinal = super.getPrecioBase() + (super.getPeso() * super.getTamanio() * TIEMPO);

        return precioFinal;
    }
    // getters/setters de ser necesarios
}
