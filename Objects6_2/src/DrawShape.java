
public class DrawShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Circle circle = new Circle();
		
//		circle.r = 5;
//		Point p = new Point();
		
//		circle.point.x = 2;
//		circle.point.y = 3;
		
//		p.x = 2;
//		p.y = 3;
		
//		circle.point = p;
		
//		circle.info();
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(5, 3);
		Point p3 = new Point(2, 10);
		Point p4 = new Point(5, 10);
		
		Point[] pointArr = new Point[4];	
//		for (int i = 0; i < pointArr.length; i++) {
//			pointArr[i] = new Point(i+2, i*3);
//		}
		
		pointArr[0] = p1;
		pointArr[1] = p2;
		pointArr[2] = p3;
		pointArr[3] = p4;
		
//		Triangle tri = new Triangle(pointArr);
//		Triangle tri = new Triangle(p1, p2, p3);
		
		Rectangle rec = new Rectangle(p1, p2, p3, p4);
		
		rec.info();

	}

}
