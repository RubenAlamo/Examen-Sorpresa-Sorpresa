package GuiFactory;

import Cliente.Cliente;
import Dialogo.Dialogo;
import GuiFactory.GuiFactory;
import Dialogo.DialogoMac;
import Cliente.FabricadialogoMac;

public class MacOsFactory implements GuiFactory {
    public Dialogo crearDialogo() {
        return new DialogoMac();
    }

    @Override
    public Cliente crearCliente() {
        return new FabricadialogoMac();
    }
}