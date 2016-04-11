package es.ual.dibujable;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Panel;
import java.util.Iterator;
import java.util.List;

public class PanelDibujo extends Panel {
	// variable miembro
	private List v;

	// constructor
	public PanelDibujo(List va) {
		super(new FlowLayout());
		this.v = va;
	}

	@Override
	// redefinición del método paint()
	public void paint(Graphics g) {
		Dibujable dib;
		Iterator it;
		it = v.iterator();
		while (it.hasNext()) {
			dib = (Dibujable) it.next();
			dib.dibujar(g);
		}
	}
} // Fin de la clase PanelDibujo