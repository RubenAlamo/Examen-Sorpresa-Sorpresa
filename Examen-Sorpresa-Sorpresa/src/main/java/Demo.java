import Aplicacion.Aplicacion;
import GuiFactory.GuiFactory;
import GuiFactory.MacOsFactory;
import GuiFactory.WindowsFactory;
public class Demo {
    private static Aplicacion configurarAplicacion() {
        Aplicacion app;
        GuiFactory factory;
        String sistemaOperativo = System.getProperty("os.name").toLowerCase();
        if (sistemaOperativo.contains("windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacOsFactory();
        }
        app = new Aplicacion(factory);
        return app;
    }
    public static void main(String[] args) {
        Aplicacion app = configurarAplicacion();
        app.dialogo();
        app.crearDialogo();
    }

}