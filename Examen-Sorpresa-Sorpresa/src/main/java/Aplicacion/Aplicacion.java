package Aplicacion;

import Cliente.Cliente;
import Dialogo.Dialogo;
import GuiFactory.GuiFactory;

public class Aplicacion {
    private Dialogo dialogo;
    private Cliente cliente;

    public Aplicacion(GuiFactory factory) {
        dialogo = factory.crearDialogo();
        cliente = factory.crearCliente();
    }

    public void dialogo() {
        dialogo.dialogo();
    }
    public void crearDialogo(){
        cliente.crearDialogo();
    }
}
