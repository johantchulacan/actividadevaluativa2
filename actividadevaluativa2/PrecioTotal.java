// Inicio de la solución
public class PrecioTotal {
    // Atributos
    private double totalPrecios;
    private double totalBodega;
    private double totalCabina;
    private Equipaje[] equipaje;

    // Constructores
    public PrecioTotal(Equipaje[] equipaje) {
        this.equipaje = equipaje;
    }

    // Metodos
    public void calcularTotales(){
    
    totalPrecios = 0;
    totalBodega = 0;
    totalCabina = 0;

    for (Equipaje e : equipaje) {
        double precio = e.calcularPrecio();
        totalPrecios += precio;

        if (e instanceof Bodega) {
            totalBodega += precio;
        } else if (e instanceof Cabina) {
            totalCabina += precio;
        }
    }
}
    
    public void mostrarTotales() {
    // Calculo de totales
    calcularTotales();
    System.out.println("Total Equipaje " + totalPrecios);
    System.out.println("Total Bodega " + totalBodega);
    System.out.println("Total Cabina " + totalCabina);
    }
   }
   public class Equipaje {
    // Constantes
    private static final double PESO = 10.0;
    private static final double TAMANIO = 4.5;
    private static final double PRECIO_BASE = 1000.0;
    // Atributos
    private double peso;
    private double tamanio;
    private double precioBase;
    // Constructores

    public Equipaje(double peso, double tamanio) {
        this.peso = peso;
        this.tamanio = tamanio;
        this.precioBase = PRECIO_BASE;
    }

    public Equipaje(double precioBase) {
        this.peso = PESO;
        this.tamanio = TAMANIO;
        this.precioBase = precioBase;
    }

    public Equipaje() {
        this.peso = PESO;
        this.tamanio = TAMANIO;
        this.precioBase = PRECIO_BASE;
    }
   
    // Metodos
    public double calcularPrecio(){
    return 0.0;
    }
    // getters/setters de ser necesarios

    public double getPeso() {
        return peso;
    }

    public double getTamanio() {
        return tamanio;
    }

    public double getPrecioBase() {
        return precioBase;
    }
}

   public class Bodega extends Equipaje {
    // Constantes
    private static final double CAPACIDAD = 8.0;
    // Constructores
    public Bodega(double peso, double tamanio) {
        super(peso, tamanio);
    }

    public Bodega(double precioBase) {
        super(precioBase);
    }

    public Bodega() {
        super();
    }

    // Metodos
    public double calcularPrecio(){

    // Calculos
    double precioFinal = precioBase + (peso * tamanio * CAPACIDAD);
    return precioFinal;
    }
    // getters/setters de ser necesarios
   }
   public class Cabina extends Equipaje {
    // Constantes
    private final static int TIEMPO = 2;
    // Constructores
    public Cabina(double precioBase, double tamanio) {
        super(precioBase);
        this.tamanio = tamanio;
    }

    public Cabina() {
        super();
    }

    // Metodos
    public double calcularPrecio(){
    // Calculos
    double precioFinal = precioBase + (peso * tamanio * TIEMPO);
    return precioFinal;
    }
    // getters/setters de ser necesarios
   }
   // Fin de la solución