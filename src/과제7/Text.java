package ����7;

class Text extends Shape   {
	String name;//instance variable ����.
	public Text() {}//������ default
	public Text(String name) {
		this.name=name;//instance variable set
		
	}
	public void draw() {
		System.out.println(this.name);//Shape���� implements�� draw�� override
	}
		
	

}

