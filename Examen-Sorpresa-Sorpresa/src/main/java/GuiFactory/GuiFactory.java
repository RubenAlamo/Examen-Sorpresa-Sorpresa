package GuiFactory;
import Cliente.Cliente;
import Dialogo.Dialogo;

public interface GuiFactory {
    Dialogo crearDialogo();
    Cliente crearCliente();
}
