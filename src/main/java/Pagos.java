import java.util.ArrayList;
import java.util.List;

public class Pagos {
    private List<MetodoPago> metodosPago;

    public Pagos() {
        this.metodosPago = new ArrayList<>();
    }

    public void agregarMetodoPago(MetodoPago metodo) {
        metodosPago.add(metodo);
    }

    public void realizarPago(String numero, double monto) {
        for (MetodoPago metodo : metodosPago) {
            if (metodo.numero.equals(numero)) {
                if (metodo.realizarPago(monto)) {
                    System.out.println("Pago realizado con éxito.");
                } else {
                    System.out.println("Error al realizar el pago.");
                }
                return;
            }
        }
        System.out.println("Método de pago no encontrado.");
    }

    public void cancelarPago(String numero, double monto) {
        for (MetodoPago metodo : metodosPago) {
            if (metodo instanceof Cancelable && metodo.numero.equals(numero)) {
                if (((Cancelable) metodo).cancelarPago(monto)) {
                    System.out.println("Pago cancelado con éxito.");
                } else {
                    System.out.println("Error al cancelar el pago.");
                }
                return;
            }
        }
        System.out.println("Método de pago no encontrado o no cancelable.");
    }

    public void mostrarMetodosPago() {
        for (MetodoPago metodo : metodosPago) {
            System.out.println(metodo);
        }
    }
}
