/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;
import Vista.vistaJugador;
import Controlador.controladorJugador;
import Controlador.ControladorPrincipal;
import Vista.vistaPrincipal;
/**
 *
 * @author andres
 */
public class Cliente {
    public static void main(String[] args) {
        vistaJugador vistaJugador = new vistaJugador();
        vistaPrincipal vistaPrincipal = new vistaPrincipal();
        ControladorPrincipal controladorPrincipal = new ControladorPrincipal(vistaPrincipal);
        controladorJugador controladorJugador = new controladorJugador(vistaJugador);
    }
    
}
