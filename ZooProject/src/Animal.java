//define an abstract class Animal
public abstract class Animal {
	
	//fields required
	private String name;
	private int age;
	private boolean isHungry;
	
	
	//create a constructor with 3 parameters
	public Animal(String name, int age, boolean isHungry){
			
		this.name = name;
		//call on the data validation in the setter which makes sure a negative value isn't assigned.
		this.setAge(age);
		this.isHungry = isHungry;
	}
	
	//create an empty constructor to set the defaults 
	public Animal (){
		this("Unknown", 0, false);
	}

	//create abstract methods feed and performTrick to return a string type
	public abstract String feed();
	
	public abstract String performTrick();	

	
	
	
	//Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	
	//this setter uses an if statement for data validation to ensure a negative value isn't passed
	public void setAge(int age) {
		//TODO tertiary operator ?
		if(age>=0){
			this.age = age;
			}
		else{
			age=0;
		}
	}

	public boolean isHungry() {
		return isHungry;
	}

	public void setHungry(boolean isHungry) {
		this.isHungry = isHungry;
	}

}
