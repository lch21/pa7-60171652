package ����7;

abstract class Shape implements Drawable {
	//�߻� Ŭ���� Shape�� Drawable�� implemnts��.
	private double area;
	private double length;
	//abstract class�� method�� return���� ���� �ϱ����� private���� ����.
	public void draw() {
	}//Drawable�� interface�� override.
	public double getArea() {return area;}
	public double getLength() {return length;}
}   //Rectangle�� Circle class���� override�ϱ����� ����.


