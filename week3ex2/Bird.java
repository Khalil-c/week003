package week3ex2;

public class Bird extends Animal{
	private String color = "";
	private int age = 0;
	
	public Bird(String name, int weight) {
		super(name,weight);
	
	}

	public Bird(String color, int age, String name, int weight) {
		super(name,weight);
		this.color = color;
		this.age = age;
		// TODO Auto-generated constructor stub
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Bird [color = "  + color + ", age = " + age + " ,name = " + getName() + ", weight = " + getWeight() +"]";
	}
	

}
