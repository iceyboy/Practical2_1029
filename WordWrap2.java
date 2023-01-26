package usingmethods;

import java.util.Scanner;

public class WordWrap2 {

	public static void main(String[] args) {
		
		// Get the word we need to display 
		  String word = getWord(); 
		 
		  // The first line of required output 
		  outputFirst(word); 
		 
		  // Output the middle lines ... 
		  outputMiddle(word); 
		 
		  // The last line of output 
		  outputLast(word); 
		

	}

	public static String getWord() {

		// declare & initialise a Scanner for KB data entry
		Scanner input = new Scanner(System.in);

		// display a message
		System.out.print("Enter a single word: ");

		// read a word - 'next' different to 'nextLine'?
		String word = input.nextLine();

		// It's a good idea to 'close' a Scanner after use
		input.close();

		// return word to caller
		return word;

	}

	public static void outputFirst(String word) {

		System.out.println(word);

	}

	public static void outputMiddle(String word) {

		// some data required here

		int len = word.length(); // get the length of word
		int numLines = len - 2; // len-2 lines to display
		int index1 = 1; // initial index for 1st character
		int index2 = len - 2; // initial index for 2nd character
		int gap = len - 2; // gap between characters

		// display middle characters

		for (int count = 1; count <= numLines; count++) { // for each line

			// output 1st character

			System.out.print(word.charAt(index1));

			index1++;

			// move index1 up 1

			// output spaces
			for (int space = 1; space <= gap; space++) {

				System.out.print(" ");

			}

			// output 2nd character
			System.out.println(word.charAt(index2));

			index2--; // move index2 down 1

		}

	}

	public static void outputLast(String word) {

		String temp = reverseWord(word);

		System.out.println(temp);

	}

	public static String reverseWord(String word) {

		// get the length of 'word'---------^

		int len = word.length();

		// create an 'empty' String - will contain result of reversal

		String result = "";

		// use 'len' to control the loop - counting backwards

		for (int count = len - 1; count >= 0; count--) {

			result = result + word.charAt(count);

		}

		// return 'result' to caller

		return result;

	}

}
