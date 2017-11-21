package 과제7;

public class Rectangle extends Shape {//Rectangle class는 Shape class를 상속함.
	double a,b,c,d;//instance variable 4개 설정.
	
	public Rectangle() {}//생성자 default
	public Rectangle(int a,int b,int c,int d) {//생성자, instance variable을 set
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	public double getArea() {
		return c*d;//Shape에서 설정한 method override
		
}
	public double getLength() {
		return(c*2+d*2);//Shape에서 설정한 method override
		
	}
	public void draw() {
		System.out.println("Rectangle"+"("+a+","+b+")"+"-"+"("+(a+c)+","+(b+d)+")");
	}//Shape에서 implements한 draw를 override
}
