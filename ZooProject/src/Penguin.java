//Define a subclass penguin and extend the super class animal
public class Penguin extends Animal {

	//This calls the blank constructor from the animal class which sets default values
	public Penguin(){
		super();
	}
	
	//calls the constructor in the super class and passing the parameters
	public Penguin(String name, int age, boolean isHungry){
		super(name, age, isHungry);
	}

	//Implementing the feed method from the abstract Animal class
	//Returns String containing feed info
	@Override
	public String feed() {
		return "Penguin " + getName() + " is being fed. He eats fish from a bucket.";//returns the penguin's feed method
	}

	//Implementing the performTrick method from the abstract Animal class
	//Returns String containing Trick info
	@Override
	public String performTrick() {
		return "Penguin " + getName() + " flaps wings.";//returns the penguin's perform trick method
	}

}
