import java.util.ArrayList;
import java.util.List;

public class Reservas {
    private List<Vuelo> vuelos;

    public Reservas() {
        this.vuelos = new ArrayList<>();
    }

    public void agregarVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
    }

    public double calcularPrecioTotal() {
        return vuelos.stream().mapToDouble(Vuelo::calcularPrecio).sum();
    }

    public void aplicarPromocion(double porcentaje) {
        for (Vuelo vuelo : vuelos) {
            if (vuelo instanceof Promocionable) {
                ((Promocionable) vuelo).aplicarPromocion(porcentaje);
            }
        }
    }

    public void mostrarVuelos() {
        for (Vuelo vuelo : vuelos) {
            System.out.println(vuelo);
        }
    }
}
