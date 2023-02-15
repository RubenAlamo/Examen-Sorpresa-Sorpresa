package GuiFactory;

import Cliente.Cliente;
import Dialogo.Dialogo;
import GuiFactory.GuiFactory;
import Dialogo.DialogoWindows;
import Cliente.FabricaDialogoWindows;

public class WindowsFactory implements GuiFactory {
    public Dialogo crearDialogo() {
        return new DialogoWindows();
    }
    public Cliente crearCliente() {
        return new FabricaDialogoWindows();
    }
}
