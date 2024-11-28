public class TarjetaCredito extends MetodoPago implements Cancelable {
    private String fechaExpiracion;
    private String codigoSeguridad;

    public TarjetaCredito(String titular, String numero, String fechaExpiracion, String codigoSeguridad) {
        super(titular, numero);
        this.fechaExpiracion = fechaExpiracion;
        this.codigoSeguridad = codigoSeguridad;
    }

    @Override
    public boolean realizarPago(double monto) {
        System.out.println("Procesando pago de $" + monto + " con tarjeta de crédito...");
        // Simulación: Siempre devuelve true
        return true;
    }

    @Override
    public boolean cancelarPago(double monto) {
        System.out.println("Cancelando pago de $" + monto + " con tarjeta de crédito...");
        // Simulación: Siempre devuelve true
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + ", TarjetaCredito{" +
                "fechaExpiracion='" + fechaExpiracion + '\'' +
                ", codigoSeguridad='" + codigoSeguridad + '\'' +
                '}';
    }
}
