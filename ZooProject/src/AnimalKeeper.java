//define a class Animal Keeper
public class AnimalKeeper {
	
	//the animal keeper can feed any animal subclass
	public String feedAnimal(Animal animal){
		return animal.feed();
	}
	
}
