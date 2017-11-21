package ����7;

public class Circle extends Shape {
	double a,b,c;//instance variable ����.
	public Circle() {}//������ default
	public Circle(int a, int b,int c) {//instance variable set
		this.a=a;
		this.b=b;
		this.c=c;
		
	} 
	public double getArea(){
		return c*c*Math.PI;  //Shape�� method�� override

}
	public double getLength() {
		return c*2*Math.PI;//Shape�� method�� override
		
	}
	public void draw() {
		System.out.println("Circle center"+"("+a+","+b+")"+"- radius"+"("+c+")");
	}//Shape���� implements�� draw�� override
}
