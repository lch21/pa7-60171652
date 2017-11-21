package 과제7;

class Text extends Shape   {
	String name;//instance variable 설정.
	public Text() {}//생성자 default
	public Text(String name) {
		this.name=name;//instance variable set
		
	}
	public void draw() {
		System.out.println(this.name);//Shape에서 implements한 draw를 override
	}
		
	

}

