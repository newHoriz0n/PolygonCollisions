package model;

import java.awt.geom.Path2D;

public class Polygon {

	private Path2D.Double form;		// exakte Position der einzelnen Ecken
	private double [] cog;	// Schwerpunkt
	
	public Polygon (double [] xs, double [] ys) {

		if(xs.length != ys.length) {
			throw new IllegalArgumentException("Länge der Arrays xs und ys muss gleich sein!");
		}
		
		this.form = new Path2D.Double();

		form.moveTo(xs[0], ys[0]);
		for(int i = 1; i < xs.length; ++i) {
			form.lineTo(xs[i], ys[i]);
		}
		form.closePath();		
		
	}
	
}
