package model.entities;

import java.awt.Color;

public abstract class AbstractShape implements Shape {
	
	private Color color;

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	
}
