package people;

public class Human {

	private String name = "";
	private int age = 0;
	private String sex = "";
	private String hairColor = "";

	public Human(String name, int age, String sex, String hairColor) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.hairColor = hairColor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", sex=" + sex + ", hairColor=" + hairColor + "]";
	}

}
