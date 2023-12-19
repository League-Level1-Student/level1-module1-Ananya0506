package _07_duck;

public class Dog {
	int numberOfToys;
	String Breed;
	void bark() {
		System.out.println("bark");
	}
	void paw() {
		System.out.println("paw");
	}
	Dog(String FavoriteFood, int numberOfFriends) {
	    this.Breed = FavoriteFood;
	    this.numberOfToys = numberOfFriends;
	}
}
