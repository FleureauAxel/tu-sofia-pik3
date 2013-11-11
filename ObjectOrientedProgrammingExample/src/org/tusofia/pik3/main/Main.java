package org.tusofia.pik3.main;

import org.tusofia.pik3.zoo.Animal;
import org.tusofia.pik3.zoo.Cat;
import org.tusofia.pik3.zoo.Dog;
import org.tusofia.pik3.zoo.Mammal;

/**
 * This is the main class that tests all the classes we have already written.
 * 
 * @author Kiril Aleksandrov
 * 
 */
public class Main {

	/**
	 * The entry point of the program.
	 */
	public static void main(String[] args) {

		/* Inheritance example */

		System.out.println("===  Inheritance  example ===");

		Cat cat = new Cat(); /* See what is the order of constructor's execution. */
		cat.speak(); /* The "speak" method is derived from the Mammal class. */

		System.out.println("=============================");
		System.out.println();

		/* Encapsulation example */

		System.out.println("=== Encapsulation example ===");

		Dog d = new Dog("Sharo");
		System.out.println(d.getName()); /* d.name is NOT allowed !! */

		System.out.println("=============================");
		System.out.println();

		/* Polymorphism example */

		System.out.println("=== Polymorphism example  ===");

		Animal[] zoo = new Animal[3]; /* Create an array of Animal object. */

		zoo[0] = new Dog();
		zoo[1] = new Cat();
		zoo[2] = new Mammal();

		System.out.println("--- Call the  speak() method ");

		for (Animal animal : zoo) {
			animal.speak();
		}

		System.out.println("-----------------------------");

		System.out.println("=============================");
		System.out.println();

		/* Static counter example */

		System.out.println("=== Static field  example ===");

		/* Print the sum of all created animals */
		System.out.println("All created animals count : " + Animal.getCount());

		System.out.println("=============================");
		System.out.println();
	}
}
