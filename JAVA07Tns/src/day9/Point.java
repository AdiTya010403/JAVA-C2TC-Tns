package day9;

public class Point {
	float pointA;
	float pointB;
	
	public Point() {
		
		System.out.println("This is Points Class");
	}
	
	public Point(float pointA) {
		
		this.pointA = pointA;
		System.out.println("First Point: "+pointA);
	}
	
	public Point(float pointA, float pointB) {
		
		this.pointA = pointA;
		this.pointB = pointB;
		System.out.println("Points: "+"( "+pointA+", "+pointB+" )");
	}
	
}
