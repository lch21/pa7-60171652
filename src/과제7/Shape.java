package 과제7;

abstract class Shape implements Drawable {
	//추상 클래스 Shape는 Drawable을 implemnts함.
	private double area;
	private double length;
	//abstract class의 method의 return값을 설정 하기위해 private으로 설정.
	public void draw() {
	}//Drawable의 interface를 override.
	public double getArea() {return area;}
	public double getLength() {return length;}
}   //Rectangle과 Circle class에서 override하기위해 설정.


