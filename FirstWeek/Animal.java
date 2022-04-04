public class Animal {
	// Instance data (object variable / object attribute)
	private final String name;
	private final int age;
	private final String color;

	/* constructor
	 *
	 */
	public Animal(String name, int age, String color)
	{
		this.name = name;
		this.age = age;
		this.color = color;
	}

	public String toString()
	{
		return "[ " + name + ", age=" + age + ",color=" + color + " ]";
		
	}

}