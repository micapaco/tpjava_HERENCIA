public class SistemaNotificaciones {
    public static void main(String[] args) {
        Notificaciones sistema = new Notificaciones();


        CorreoElectronico correo = new CorreoElectronico("Juan", "Hola Juan, tienes una notificación importante.", "juan@example.com");
        MensajeTexto mensaje = new MensajeTexto("Ana", "Hola Ana, revisa tu cuenta.", "+123456789");


        sistema.agregarCanal(correo);
        sistema.agregarCanal(mensaje);


        System.out.println("Canales de notificación registrados:");
        sistema.mostrarCanales();


        System.out.println("\nEnviando notificaciones...");
        sistema.enviarNotificaciones();


        System.out.println("\nPersonalizando mensajes...");
        sistema.personalizarMensaje("Juan", "Hola Juan, tu pedido está en camino.");
        sistema.personalizarMensaje("Ana", "Hola Ana, tu factura está lista para ser revisada.");


        System.out.println("\nCanales después de personalizar mensajes:");
        sistema.mostrarCanales();


        System.out.println("\nEnviando notificaciones nuevamente...");
        sistema.enviarNotificaciones();
    }
}
