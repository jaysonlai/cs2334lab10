import java.awt.Color;
import java.awt.Point;

public class IsoscelesTriangle extends Triangle {
	public IsocelesTriangle(Point pointLB, int base, int height, Color color, boolean fill) {
			super(pointLB, color, fill);
			
			location[1] = new Point(pointLB.x + base, pointLB.y);
			location[2] = new Point(pointLB.x + height, pointLB.y);
	}
	
}
