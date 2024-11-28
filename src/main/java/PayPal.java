public class PayPal extends MetodoPago implements Cancelable {
    private String correoElectronico;

    public PayPal(String titular, String numero, String correoElectronico) {
        super(titular, numero);
        this.correoElectronico = correoElectronico;
    }

    @Override
    public boolean realizarPago(double monto) {
        System.out.println("Procesando pago de $" + monto + " con PayPal (" + correoElectronico + ")...");
        // Simulación: Siempre devuelve true
        return true;
    }

    @Override
    public boolean cancelarPago(double monto) {
        System.out.println("Cancelando pago de $" + monto + " con PayPal (" + correoElectronico + ")...");
        // Simulación: Siempre devuelve true
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + ", PayPal{" +
                "correoElectronico='" + correoElectronico + '\'' +
                '}';
    }
}
