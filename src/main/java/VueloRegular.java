public class VueloRegular extends Vuelo implements Promocionable {
    private int numeroAsientos;
    private double precioBase;

    public VueloRegular(String numeroVuelo, String origen, String destino, String fecha, int numeroAsientos, double precioBase) {
        super(numeroVuelo, origen, destino, fecha);
        this.numeroAsientos = numeroAsientos;
        this.precioBase = precioBase;
    }

    @Override
    public double calcularPrecio() {
        return numeroAsientos * precioBase;
    }

    @Override
    public void aplicarPromocion(double porcentaje) {
        this.precioBase -= this.precioBase * (porcentaje / 100);
    }

    @Override
    public String toString() {
        return super.toString() + ", VueloRegular{" +
                "numeroAsientos=" + numeroAsientos +
                ", precioBase=" + precioBase +
                '}';
    }
}
