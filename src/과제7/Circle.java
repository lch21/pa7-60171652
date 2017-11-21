package 과제7;

public class Circle extends Shape {
	double a,b,c;//instance variable 설정.
	public Circle() {}//생성자 default
	public Circle(int a, int b,int c) {//instance variable set
		this.a=a;
		this.b=b;
		this.c=c;
		
	} 
	public double getArea(){
		return c*c*Math.PI;  //Shape의 method를 override

}
	public double getLength() {
		return c*2*Math.PI;//Shape의 method를 override
		
	}
	public void draw() {
		System.out.println("Circle center"+"("+a+","+b+")"+"- radius"+"("+c+")");
	}//Shape에서 implements한 draw값 override
}
