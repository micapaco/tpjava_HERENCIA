import java.util.ArrayList;
import java.util.List;

public class Notificaciones {
    private List<CanalNotificacion> canales;

    public Notificaciones() {
        this.canales = new ArrayList<>();
    }

    public void agregarCanal(CanalNotificacion canal) {
        canales.add(canal);
    }

    public void enviarNotificaciones() {
        for (CanalNotificacion canal : canales) {
            canal.enviarNotificacion();
        }
    }

    public void personalizarMensaje(String usuario, String nuevoMensaje) {
        for (CanalNotificacion canal : canales) {
            if (canal.usuario.equals(usuario) && canal instanceof Personalizable) {
                ((Personalizable) canal).personalizarMensaje(nuevoMensaje);
                System.out.println("Mensaje personalizado para " + usuario);
            }
        }
    }

    public void mostrarCanales() {
        for (CanalNotificacion canal : canales) {
            System.out.println(canal);
        }
    }
}
