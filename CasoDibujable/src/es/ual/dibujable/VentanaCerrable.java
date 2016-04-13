package es.ual.dibujable;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
class VentanaCerrable extends Frame implements WindowListener {
	// constructores
	public VentanaCerrable() {
		super();
	}

	public VentanaCerrable(String title) {
		super(title);
		setSize(500, 500);
		addWindowListener(this);
	}

	@Override
	// métodos de la interface WindowsListener
	public void windowActivated(WindowEvent e) {
		//No necesita sobreescribir el método
	}

	@Override
	public void windowClosed(WindowEvent e) {
		//No necesita sobreescribir el método
	}

	@Override
	public void windowClosing(WindowEvent e) {
		this.dispose();
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		//No necesita sobreescribir el método
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void windowIconified(WindowEvent e) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		//No necesita sobreescribir el método
	}
} // fin de la clase VentanaCerrable
