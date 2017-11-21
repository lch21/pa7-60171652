package ����7;

public class Rectangle extends Shape {//Rectangle class�� Shape class�� �����.
	double a,b,c,d;//instance variable 4�� ����.
	
	public Rectangle() {}//������ default
	public Rectangle(int a,int b,int c,int d) {//������, instance variable�� set
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	public double getArea() {
		return c*d;//Shape���� ������ method override
		
}
	public double getLength() {
		return(c*2+d*2);//Shape���� ������ method override
		
	}
	public void draw() {
		System.out.println("Rectangle"+"("+a+","+b+")"+"-"+"("+(a+c)+","+(b+d)+")");
	}//Shape���� implements�� draw�� override
}
