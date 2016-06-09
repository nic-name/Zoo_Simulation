//imports the arraylist package
import java.util.ArrayList;
import java.util.List;

//main method
public class Main {

	public static void main(String[] args) {

		//create an animalKeeper object 
		AnimalKeeper keeperMcKeeperson = new AnimalKeeper();
			
		//Create 4 animal subclass objects with the following strings and values
		Animal p   = new Penguin("Pengy",2,false); //(name, age, isHungry)
		Animal p2  = new Penguin("Flapper",3,true);
		Animal e  = new Elephant("Nelly",4, true);
		Animal e2 = new Elephant("Tiny",6, false);
		
		//create an arraylist of animal type
		List <Animal> animalList = new ArrayList <>();
		
		//add the animal subclass objects to the arraylist 
		animalList.add(p);
		animalList.add(p2);
		animalList.add(e);
		animalList.add(e2);
		
		//use an enhanced for loop
		for (Animal a : animalList){
			   //if the animal is hungry (returns a boolean - true) then feed the animal
			if(a.isHungry() == true){
				                   //the keeper feeds the animal
				System.out.println(keeperMcKeeperson.feedAnimal(a));//print out the animal and its feed
			}
			else //otherwise print out the trick the animal performs
				System.out.println(a.performTrick());
		}
		
		

	}

}
