/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.vistaJugador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author andres
 */
public class controladorJugador extends Thread implements ActionListener {

    vistaJugador vistajugador = new vistaJugador();

    public controladorJugador(vistaJugador vistaJugador) {
        this.vistajugador = vistaJugador;
        vistaJugador.btnCont1.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equalsIgnoreCase("Continuar")){
        vistajugador.setVisible(false);
    }
        
    }
}
