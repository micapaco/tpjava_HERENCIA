public class SistemaReservas {
    public static void main(String[] args) {
        Reservas reservas = new Reservas();

        VueloRegular vuelo1 = new VueloRegular("VR123", "Buenos Aires", "Madrid", "2024-12-01", 200, 500);
        VueloCharter vuelo2 = new VueloCharter("VC456", "Londres", "París", "2024-12-05", 10000);

        reservas.agregarVuelo(vuelo1);
        reservas.agregarVuelo(vuelo2);

        System.out.println("Vuelos antes de aplicar promoción:");
        reservas.mostrarVuelos();

        reservas.aplicarPromocion(10);

        System.out.println("\nVuelos después de aplicar promoción:");
        reservas.mostrarVuelos();

        System.out.println("\nPrecio total de las reservas: " + reservas.calcularPrecioTotal());
    }
}
