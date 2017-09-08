//package edu.gatech.oad.antlab.person;
import java.util.Random;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string
 *
 * @author Bob
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;

	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
		char[] array = new char[input.length()];
		for (int i = 0; i < input.length(); i++) {
			array[i] = input.charAt(i);
		}
		int n = array.length;
        Random random = new Random();
        for (int i = n; i > 1; i--) {
        	swap(array, i - 1, random.nextInt(i));
        }
        String text = String.valueOf(array);
        return text;
	}

	private static void swap(char[] array, int i, int j) {
        char temp = array[i];
     	array[i] = array[j];
       	array[j] = temp;
    }
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
}
