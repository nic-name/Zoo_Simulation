//Define a subclass elephant and extend the super class animal
public class Elephant extends Animal {
	
	//This calls the blank constructor from the animal class and sets default values
	public Elephant(){
		super();
	}
	
	//calls the constructor in the super class and passes the following 
	public Elephant(String name, int age, boolean isHungry){
		super(name, age, isHungry); 
	}

	//Implementing the feed method from the abstract Animal class
	//Returns String containing feed info
	@Override
	public String feed() {
		return "Elephant " + getName() + " is being fed, he eats hay.";//returns the elephant's feed method
	}

	//Implementing the performTrick method from the abstract Animal class
	//Returns String containing Trick info
	@Override
	public String performTrick() {
		return "Elephant " + getName() + " blows with his trunk.";//returns the elephant's perform trick method
	}
	
}
