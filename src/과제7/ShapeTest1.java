package ����7;

public class ShapeTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape [] shapes = new Shape[3];//Shape�� type���� 3���� ������ �� shapes array����.
		shapes[0]=new Rectangle(10,20,30,40);//shapes�� 0��°�� Rectangle �����ڿ� arguments�� �־� ��ü����
		shapes[1]=new Rectangle(30,30,10,10);//shapes�� 1��°�� Rectangle �����ڿ� arguments�� �־� ��ü����
		shapes[2]=new Circle(50,20,30);//shapes�� 2��°�� Rectangle �����ڿ� arguments�� �־� ��ü����
		
		for(Shape s:shapes) {//Shape�� type������ s�� shapes��θ� ���ʷ� �־���.
			System.out.printf("Area: %.1f\n", s.getArea());//for�� ���ʴ�� �� class���� ������ getArea ���
			System.out.printf("Length: %.1f\n", s.getLength());//for�� ���ʴ�� �� class���� ������ getLength ���
		}
		
		Drawable[] drawables=new Drawable[4];//Drawable�� type���� ������ 4���� array����.
		for(int i=0;i<shapes.length;i++) {//for�� ����, shapes�� length��ŭ ���� �־�� shapes�� index���� array�� ��.
			drawables[i]=(Drawable) shapes[i];//drawables array�� ���ʴ�� shapes�� index���� �־���.
		}
		drawables[3]=new Text("Sample Text");//drawables�� 3��° index���� Text class �� argument�� �־��� ���� ��ü�� �����Ͽ� �־���.
		for(Drawable d:drawables) {//for��, Drawable type�� d �� drawables�� ���ʷ� �־��ָ� ������.
			d.draw();//�� class ���� override�� method����.
			
		}
		
	}

}
