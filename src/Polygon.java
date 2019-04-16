import java.awt.Color;
import java.awt.Graphics;

public abstract class Polygon extends Shape{

	public Polygon(Color color, boolean filled) {
		super(color, filled);
	}
	
	public void draw(Graphics graphics) {
		graphics.setColor(this.getColor());
		
		int here = location.length;
		int[] x = new int[here];
		int[] y = new int[here];
		
		for(int index = 0; index < location.length; index++) {
			x[index] = location[index].x;
			y[index] = location[index].y;					
		}
		
		if(this.isFilled()) {
			graphics.fillPolygon(x,y,here);
		}
		
		graphics.drawPolygon(x,y,here);
	}
}
