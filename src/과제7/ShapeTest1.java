package 과제7;

public class ShapeTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape [] shapes = new Shape[3];//Shape를 type으로 3개의 변수가 들어간 shapes array설정.
		shapes[0]=new Rectangle(10,20,30,40);//shapes의 0번째를 Rectangle 생성자에 arguments를 주어 객체생성
		shapes[1]=new Rectangle(30,30,10,10);//shapes의 1번째를 Rectangle 생성자에 arguments를 주어 객체생성
		shapes[2]=new Circle(50,20,30);//shapes의 2번째를 Rectangle 생성자에 arguments를 주어 객체생성
		
		for(Shape s:shapes) {//Shape을 type으로한 s에 shapes모두를 차례로 넣어줌.
			System.out.printf("Area: %.1f\n", s.getArea());//for문 차례대로 각 class에서 설정한 getArea 출력
			System.out.printf("Length: %.1f\n", s.getLength());//for문 차례대로 각 class에서 설정한 getLength 출력
		}
		
		Drawable[] drawables=new Drawable[4];//Drawable을 type으로 개수가 4개인 array설정.
		for(int i=0;i<shapes.length;i++) {//for문 설정, shapes의 length만큼 돌려 주어야 shapes의 index값이 array로 들어감.
			drawables[i]=(Drawable) shapes[i];//drawables array에 차례대로 shapes의 index값을 넣어줌.
		}
		drawables[3]=new Text("Sample Text");//drawables의 3번째 index값은 Text class 에 argument를 넣어준 값을 객체로 생성하여 넣어줌.
		for(Drawable d:drawables) {//for문, Drawable type인 d 에 drawables를 차례로 넣어주며 돌려줌.
			d.draw();//각 class 에서 override한 method실행.
			
		}
		
	}

}
