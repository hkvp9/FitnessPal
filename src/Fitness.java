
public class Fitness {
	
	
	//static double BMI = (weight * 703)/(heightInInches * heightInInches);
	public static void main(String[] args) {
		//char always in single quotes*
		Person person1 = new Person("Tom", 'H', 152.5, 5, 6);
		Person Leslie = new Person("Leslie",'K', 32, 122.9, 4, 11);
		Person man = new Person("Ron", "Swanson", 222.2, 6, 0);
		Person woman = new Person("April", "Ludgate", 110.5, 5, 5);
		
		
		System.out.println(person1.getFirstName()+ ":" + person1.calculateBMI());
			//Person.getBMI();
		System.out.println(Leslie.getFirstName()+ ":" + Leslie.calculateBMI());
		System.out.println(man.getFirstName()+ ":" + man.calculateBMI());
		System.out.println(woman.getFirstName()+ ":" + woman.calculateBMI());
		
	}///
	
	
	
	 //The formula for calculating BMI of a person is: BMI=(weight * 703)/(heightInInches * heightInInches)
	
		
		
	//Inside this method, you will have to first convert person’s height (feet & inches) to inches. To do that, create a local variable called heightInInches 
	//(think about what the data type would be). The value of this variable = (person’s feet * 12) + person’s inches.
	
	
	
}