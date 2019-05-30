/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.vistaJugador;
import Vista.vistaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author andres
 */
public class ControladorPrincipal extends Thread implements ActionListener {

    vistaJugador vistaJugador = new vistaJugador();
    vistaPrincipal vistaPrincipal = new vistaPrincipal();
    controladorJugador controladorJugador = new controladorJugador(vistaJugador);

    public ControladorPrincipal(vistaPrincipal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
        vistaPrincipal.setVisible(true);
        vistaPrincipal.btnAgregarJUgador.addActionListener(this);
        vistaPrincipal.btnSalir.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("Agregar Jugador")) {
            vistaPrincipal.setVisible(false);
            vistaJugador vistaJugador1 = new vistaJugador();
            controladorJugador.vistajugador.setVisible(true);
        }
        if (e.getActionCommand().equalsIgnoreCase("Salir")) {
            System.exit(MIN_PRIORITY);
        }

    }

}


