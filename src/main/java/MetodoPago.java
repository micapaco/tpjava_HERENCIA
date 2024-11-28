public abstract class MetodoPago {
    protected String titular;
    protected String numero;

    public MetodoPago(String titular, String numero) {
        this.titular = titular;
        this.numero = numero;
    }

    public abstract boolean realizarPago(double monto);

    @Override
    public String toString() {
        return "MetodoPago{" +
                "titular='" + titular + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}
