package es.ual.dibujable;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Panel;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings("serial")
public class PanelDibujo extends Panel {
	// variable miembro
	private transient List<Geometria> v;

	// constructor
	public PanelDibujo(List<Geometria> va) {
		super(new FlowLayout());
		this.v = va;
	}

	@Override
	// redefinición del método paint()
	public void paint(Graphics g) {
		Dibujable dib;
		Iterator<Geometria> it;
		it = v.iterator();
		while (it.hasNext()) {
			dib = (Dibujable) it.next();
			dib.dibujar(g);
		}
	}
} // Fin de la clase PanelDibujo