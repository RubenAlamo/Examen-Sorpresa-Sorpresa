import Cliente.Cliente;
import GuiFactory.WindowsFactory;
import Dialogo.DialogoWindows;
import Aplicacion.Aplicacion;
import GuiFactory.GuiFactory;
import Dialogo.Dialogo;
import GuiFactory.MacOsFactory;
import Cliente.FabricaDialogoWindows;

import org.junit.jupiter.api.Test;
public class TestExamen {
    @Test
    public void test() {
        Cliente cliente = new FabricaDialogoWindows();
        cliente.crearDialogo();
    }
    @Test
    public void test2() {
        Dialogo dialogo = new DialogoWindows();
        dialogo.dialogo();
    }
    @Test
    public void test3() {
        GuiFactory factory = new WindowsFactory();
        Aplicacion app = new Aplicacion(factory);
        app.dialogo();
        app.crearDialogo();
    }
    @Test
    public void test4() {
        GuiFactory factory = new MacOsFactory();
        Aplicacion app = new Aplicacion(factory);
        app.dialogo();
        app.crearDialogo();
    }
    @Test
    public void test5() {
        Aplicacion app = configurarAplicacion();
        app.dialogo();
        app.crearDialogo();
    }
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

    @Test
    public void test6() {
        Demo.main(null);
    }
}

