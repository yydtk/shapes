package shapes;

public class MyPic {
	public static void main(String[] args) 
	{
		Picture pic = new Picture(420,300);
		Circle c1 = new Circle(320,40,30);
		Rectangle r1 = new Rectangle(100, 100, 100, 100);
		Triangle t1 = new Triangle(100, 100, 200, 100, 150, 50);
		Line l1 = new Line(0,200,400,200);
		Circle c2 = new Circle(200,200,50);
		Circle c3=new Circle(89,25,23);
		Circle c4=new Circle(300,150,16);
		pic.add(c1);
		pic.add(r1);
		pic.add(t1);
		pic.add(l1);
		pic.add(c2);
		pic.add(c3);
		pic.add(c4);
		pic.draw();	
	}
}
