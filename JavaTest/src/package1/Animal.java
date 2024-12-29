package package1;

public class Animal {

	private int age;
	
	private float weight;

	public Animal(int age, float weight) {

		if (age > 0) {

			this.age = age;

		}

		if (weight > 0) {

			this.weight = weight;

		}

	}
	
	public int getAge() {
		
		return age;
		
	}
	
	public float getWeight() {
		
		return weight;
		
	}
	
	
	
	public void setAge(int age) {
		
		this.age = age;
		
	}
	
	public void setWeight(float weight) {
		
		this.weight = weight;
		
	}

	public void speak() {

		System.out.print("age:" + age + "\t" + "weight:" + weight);

	}

	public static void main(String[] args) {

		Animal A = new Animal(6, 5.0f);

		A.getAge();
		A.getWeight();
		A.speak();
		System.out.println();
		A.setAge(9);
		A.setWeight(10.0f);
		A.speak();

	}

}
