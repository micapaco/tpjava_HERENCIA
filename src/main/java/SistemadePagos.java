public class SistemadePagos {
    public static void main(String[] args) {
        Pagos sistema = new Pagos();


        TarjetaCredito tarjeta = new TarjetaCredito("Juan Pérez", "1234-5678-9012-3456", "12/25", "123");
        PayPal paypal = new PayPal("Ana Gómez", "paypal-001", "ana.gomez@example.com");


        sistema.agregarMetodoPago(tarjeta);
        sistema.agregarMetodoPago(paypal);


        System.out.println("Métodos de pago registrados:");
        sistema.mostrarMetodosPago();


        System.out.println("\nRealizando pagos...");
        sistema.realizarPago("1234-5678-9012-3456", 100.0);
        sistema.realizarPago("paypal-001", 200.0);


        System.out.println("\nCancelando pagos...");
        sistema.cancelarPago("1234-5678-9012-3456", 100.0);
        sistema.cancelarPago("paypal-001", 200.0);


        System.out.println("\nMétodos de pago después de las transacciones:");
        sistema.mostrarMetodosPago();
    }
}
