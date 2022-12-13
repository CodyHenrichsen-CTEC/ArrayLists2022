package list.controller;

import java.util.ArrayList;
import java.util.Arrays;

import list.model.*;
import list.view.Popup;
import java.util.Scanner;

public class Controller
{
	private Popup view;
	private ArrayList<Coffee> drinks;
	private Scanner keyboardInput;

	public Controller()
	{
		this.drinks = new ArrayList<Coffee>();
		this.keyboardInput = new Scanner(System.in);
		this.view = new Popup();
		
	}

	public void start()
	{
		creatingLists();
		informationAboutLists();
		insertingValues();
		modifyingValues();
		destroyingData();
		usingWrapperClasses();
		searchingLists();
		
		removalDemo();
		keyboardInput.close();
	}

	private void creatingLists()
	{

		ArrayList<String> useless = new ArrayList<String>(324);

		view.displayMessage("How big is useless? " + useless.size());

		ArrayList<String> myWords;
		myWords = new ArrayList<String>();

		myWords.add("Demo");
		myWords.add("String values");
		myWords.add("to show a");
		String value = "constructor";
		myWords.add(value);

		ArrayList<String> demoList = new ArrayList<String>(myWords);

		String wordsContents = myWords.toString();
		String demoContents = demoList.toString();

		boolean isTheSame = demoList.equals(myWords);
		view.displayMessage("The myWords list is the same as demoList: " + isTheSame);
		view.displayMessage("myWords: " + wordsContents + "\n" + "demoContents: " + demoContents);
		view.displayMessage("Creating ArrayLists","making lists.png");

		String[] wordsArray = { "Putting", "a", "String", "array", "into a list", "!" };
		ArrayList<String> listFromArray = new ArrayList<String>(Arrays.asList(wordsArray));
		String listContents = listFromArray.toString();
		view.displayMessage(listContents);
		view.displayMessage("From array to ArrayList", "list from array.png");
	}

	private void informationAboutLists()
	{
		view.displayMessage("The drinks list has : " + drinks.size() + " coffees");

		for (int index = 0; index < 10; index++)
		{
			Coffee current = new Coffee();
			current.setCupSize( 10 * (index + 1));
			drinks.add(current);
		}

		view.displayMessage("The drinks list has : " + drinks.size() + " coffees");

		String word = "pseudo code";
		String otherWord = "code";
		String anotherWord = "debugging";
		String yetAnotherWord = "Java";

		ArrayList<String> words = new ArrayList<String>();
		words.add(yetAnotherWord);
		words.add("");
		words.add(otherWord);
		words.add(word);
		words.add(anotherWord);
		words.add(otherWord);

		int position = words.indexOf("code");

		view.displayMessage("The first occurence of 'code' in the list is: " + position);
		boolean hasNull = words.contains(null);
		view.displayMessage("It is " + hasNull + " that the list has a null value.");
		view.displayMessage("ArrayList information methods","size indexOf and contains.png");

	}

	private void usingWrapperClasses()
	{
		ArrayList<Double> realNumbers = new ArrayList<Double>();

		view.displayMessage("Demonstrate Autoboxing", "double autobox.png");
		double number = 3.1415;
		realNumbers.add(number);

		String contents = realNumbers.toString();
		view.displayMessage("Contents of the ArrayList<Double>:\n" + contents);

		view.displayMessage("Demonstrate Autoboxing", "double wrapped.png");

		Double deprecatedDontUse = new Double(number);
		Double anotherOption = Double.valueOf(number);

		realNumbers.add(deprecatedDontUse);
		realNumbers.add(anotherOption);

		contents = realNumbers.toString();
		view.displayMessage("Contents of the ArrayList<Double>:\n" + contents);

		view.displayMessage("Demonstrate Auto unboxing and casting", "double autounbox.png");

		double result = realNumbers.get(2);
		view.displayMessage("The unwrapped value is: " + result);
		realNumbers.add((double) 2);

		ArrayList<Integer> wholeNumbers = new ArrayList<Integer>();
		view.displayMessage("Demonstrate wrapped Integer values", "int wrapped.png");

		wholeNumbers.add(Integer.valueOf(3));
		Integer myInteger = 3;
		wholeNumbers.add(myInteger);

		contents = wholeNumbers.toString();
		view.displayMessage("Contents of the ArrayList<Integer>:\n" + contents);

		view.displayMessage("Demonstrate unwrapped int values", "int unwrapped.png");

		wholeNumbers.add(-12);
		wholeNumbers.add(222);
		wholeNumbers.add(654);

		contents = wholeNumbers.toString();

		view.displayMessage("Contents of the ArrayList<Integer>:\n" + contents);

		view.displayMessage("Demonstrate casting and autobox", "int casting.png");

		wholeNumbers.add((int) (Math.E));
		contents = wholeNumbers.toString();
		view.displayMessage("Contents of the ArrayList<Integer>:\n" + contents);
		
		String intContents = "";
		
		for (int current : wholeNumbers)
		{
			intContents += "\n" + "Current int number is: " + current;
		}

		for (Integer current : wholeNumbers)
		{
			intContents += "\n" + "Current Integer number is: " + current;
		}
		view.displayMessage(intContents);
		
		view.displayMessage("Iteration is the same","looping int and Integer.png");
		
		String message = "";
		
		for (int index = 0; index < realNumbers.size(); index++)
		{
			double current = realNumbers.get(index);
			Double alsoCurrent = realNumbers.get(index);

			if (current == alsoCurrent)
			{
				message += "\n" + index + ": Comparing an Object to a primitive!!! and double values are the same!!!";
			}
		}
		
		view.displayMessage(message);
		view.displayMessage("Wrapped classes are the same as primitives!!","comparing double to Double.png");

		

	}

	private void insertingValues()
	{
		// DebugDuck
		
		ArrayList<DebugDuck> ducksList = new ArrayList<DebugDuck>();
		DebugDuck demoDuck = new DebugDuck("Mx. Quax","Xan");
		ducksList.add(demoDuck);
		demoDuck = new DebugDuck();
		ducksList.add(demoDuck);
		demoDuck = new DebugDuck("Ms. Quack", "Jen");
		ducksList.add(0, demoDuck);
		demoDuck = new DebugDuck("Miss Quack", "Jen");
		ducksList.add(ducksList.size(), demoDuck);

		String duckContent = ducksList.toString();
		view.displayMessage(duckContent);
		view.displayMessage("Adding to an ArrayList<DebugDuck>", "adding ducks.png");
		
		// Integer
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int index = 10; index >= 0; index--)
		{
			numbers.add(0, index);
		}
		String numberContent = numbers.toString();
		view.displayMessage(numberContent);
		view.displayMessage("Adding to an ArrayList<Integer>", "adding ints.png");
		
	}
	
	private void modifyingValues()
	{
		Coffee specialCoffee = new Coffee();
		specialCoffee.setCupSize(32);
		specialCoffee.setName("Vegan spicy mocha");
		
		String contents = "Drinks contains: " + "\n";
		
		for (Coffee current : drinks)
		{
			contents += current.toString();
		}
		
		
		Coffee replacedCoffee = drinks.set(drinks.size() / 2, specialCoffee);
		contents += "\n\n" + replacedCoffee.toString() + " was removed" + "\n\n";
		contents += "Drinks now contains: " + drinks.toString() + "\n";
		
		view.displayMessage(contents);
		view.displayMessage("Replacing values", "replaced coffee.png");
	}

	private void destroyingData()
	{
		String word = "Destroying";
		String otherWord = "values";
		String anotherWord = "In an ArrayList";
		String yetAnotherWord = "Java";

		ArrayList<String> words = new ArrayList<String>();
		words.add(yetAnotherWord);
		words.add("");
		words.add(otherWord);
		words.add(word);
		words.add(anotherWord);
		words.add(otherWord);

		String wordsContent = words.toString() + "\n";
		String removed = words.remove(0);
		wordsContent += removed + " was removed from the list" + "\n";
		wordsContent += words.toString() + "\n";

		boolean hasBlank = words.remove("");
		wordsContent += "Was it successful removing an empty String? " + hasBlank + "\n";
		hasBlank = words.remove("");
		wordsContent += "Was it successful removing an empty String? " + hasBlank + "\n";

		view.displayMessage(wordsContent);
		view.displayMessage("Removing one at a time", "string removal.png");

		// Coffee
		view.displayMessage("Taking all the data from the list");

		String drinksData = "There were " + drinks.size() + " coffees in the list" + "\n";
		drinks.clear();
		drinksData += "Now there are " + drinks.size() + " coffees left!";

		view.displayMessage(drinksData);
		view.displayMessage("Removing everything in one line", "drinks removal.png");
	}
	
	private ArrayList<DebugDuck> makeDuckList()
	{
		ArrayList<DebugDuck> ducks = new  ArrayList<DebugDuck>();
		
		ducks.add(new DebugDuck());
		ducks.add(new DebugDuck("Ducky","human"));
		ducks.add(new DebugDuck("Debug Ducky","mammmal"));
		ducks.add(new DebugDuck("Swift duck","self"));
		ducks.add(new DebugDuck("Java Duck","this"));
		
		ducks.get(0).askQuestion("Fake question 1");
		ducks.get(0).askQuestion("Fake question 2");
		ducks.get(1).askQuestion("Fake question 1");
		ducks.get(2).askQuestion("Fake question 1");
		ducks.get(3).askQuestion("Fake question 1");
		ducks.get(2).askQuestion("Fake question 2");
		ducks.get(2).askQuestion("Fake question 3");
		ducks.get(3).askQuestion("Fake question 2");
		ducks.get(4).askQuestion("Fake question 1");
		ducks.get(4).askQuestion("Fake question 2");
		ducks.get(2).askQuestion("Fake question 4");
		ducks.get(2).askQuestion("Fake question 5");
		
		return ducks;
	}
	
	
	private ArrayList<String> setupWords()
	{
		ArrayList<String> content = new ArrayList<String>();
		
		content.add("AP Computer Science A");
		content.add("AP Computer Science Principles");
		content.add("Software Development");
		content.add("Data Structures and Algorithms");
		content.add("Database Design and Development");
		content.add("iOS Mobile Development");
		content.add("Swift");
		content.add("Java");
		content.add("SQL");
		content.add("C++");
		content.add("C#");
		
		return content;
	}
	
	private void updateDrinks()
	{
		for (int index = 0; index < 10; index++)
		{
			Coffee current = new Coffee();
			current.setCupSize( 10 * (index + 1));
			drinks.add(current);
		}
		
		Coffee specialCoffee = new Coffee();
		specialCoffee.setCupSize(32);
		specialCoffee.setName("Vegan spicy mocha");
		drinks.add(specialCoffee);
	}
	
	private void searchingLists()
	{
		ArrayList<String> words = setupWords();
		
		int totalMatching = countByCondition(words);
		
		view.displayMessage("There are " + totalMatching + " words that have 3 or more 'e' in them.");
		view.displayMessage("Counting Algorithm", "count matching String.png");
		
		int allTheQuestions = summation(makeDuckList());
		
		view.displayMessage("There have been " + allTheQuestions + " questions answered by our DebugDucks!");
		view.displayMessage("Summation Algorithm", "summation Ducks.png");
		
		updateDrinks();
		
		Coffee smallest = findMin(drinks);
		
		view.displayMessage("The smallest coffee is a " + smallest.getName() + ", with this much coffee: " + smallest.getCupSize());
		view.displayMessage("Find minimum algorithm", "minimum coffee.png");
		
		
		String biggestWord = findMax(words);
		
		view.displayMessage("The longest word in the words list is: " + biggestWord + " and it is " + biggestWord.length() + " letters long.");
		view.displayMessage("Find maximum algorithm", "maximum String.png");
	}
		
	private int countByCondition(ArrayList<String> source)
	{
		int count = 0;
		
		for (int index = 0; index < source.size(); index++)
		{
			String currentWord = source.get(index);
			int conditionCount = 0;
			
			for (int stringIndex = 0; stringIndex < currentWord.length(); stringIndex++)
			{
				if (currentWord.substring(stringIndex, stringIndex + 1).equals("e"))
				{
					conditionCount++;
				}
			}
		
			if (conditionCount >= 3)
			{
				count++;
			}
		}
		
		return count;
	}
	
	private int summation(ArrayList<DebugDuck> ducks)
	{
		int totalQuestions = 0;
		
		for (DebugDuck currentDuck : ducks)
		{
			totalQuestions += currentDuck.getAnsweredQuestions();
		}
		
		return totalQuestions;
	}
	
	private Coffee findMin(ArrayList<Coffee> drinks)
	{
		Coffee smallest = drinks.get(0);
		
		for (Coffee current : drinks)
		{
			if (current.getCupSize() < smallest.getCupSize())
			{
				smallest = current;
			}
		}
		
		return smallest;
	}
	
	private String findMax(ArrayList<String> words)
	{
		String max = words.get(words.size() - 1);
		
		for (int index = words.size() - 2; index >= 0; index--)
		{
			String current = words.get(index);
			
			if (current.length() > max.length())
			{
				max = current;
			}
		}
		
		return max;
	}

private void removalDemo()
	{
		ArrayList<String> topics = generateTopics();

		System.out.println("Bad Removal");
		int removed = badRemovalDemo(topics, "");
		System.out.println("Should be: 5, but instead is: " + removed);
		topics = generateTopics();
		removed = badRemovalDemo(topics, "Machine Learning");
		System.out.println("Should be: 2, but instead is: " + removed);
		topics = generateTopics();
		removed = badRemovalDemo(topics, "Java");
		System.out.println("Should be: 5, but instead is: " + removed);
		
		keyboardInput.nextLine();
		System.out.println("OK Removal");

		topics = generateTopics();
		removed = okayRemovalDemo(topics, "");
		System.out.println("Should be: 5, is: " + removed);
		topics = generateTopics();
		removed = okayRemovalDemo(topics, "Machine Learning");
		System.out.println("Should be: 2, is: " + removed);
		topics = generateTopics();
		removed = okayRemovalDemo(topics, "Java");
		System.out.println("Should be: 5, is: " + removed);

		keyboardInput.nextLine();
		System.out.println("Better Removal");

		topics = generateTopics();
		removed = betterRemovalDemo(topics, "");
		System.out.println("Should be: 5, is: " + removed);
		topics = generateTopics();
		removed = betterRemovalDemo(topics, "Machine Learning");
		System.out.println("Should be: 2, is: " + removed);
		topics = generateTopics();
		removed = betterRemovalDemo(topics, "Java");
		System.out.println("Should be: 5, is: " + removed);
		
		keyboardInput.nextLine();
		System.out.println("Best Removal");

		topics = generateTopicsWithNull();
		removed = bestRemovalDemo(topics, null);
		System.out.println("Should be: 5, is: " + removed);
		topics = generateTopicsWithNull();
		removed = bestRemovalDemo(topics, "Machine Learning");
		System.out.println("Should be: 2, is: " + removed);
		topics = generateTopicsWithNull();
		removed = bestRemovalDemo(topics, "Java");
		System.out.println("Should be: 5, is: " + removed);

	}

	private ArrayList<String> generateTopics()
	{
		ArrayList<String> topics = new ArrayList<String>();

		topics.add("Computer Science");
		topics.add("Machine Learning");
		topics.add("blank");
		topics.add("Java");
		topics.add("Java");
		topics.add("blank");
		topics.add("Java");
		topics.add("blank");
		topics.add("Mobile Development");
		topics.add("Java");
		topics.add("");
		topics.add("");
		topics.add("");
		topics.add("");
		topics.add("Computer Science");
		topics.add("Java");
		topics.add("Machine Learning");
		topics.add("");

		return topics;
	}
	
	
	private ArrayList<String> generateTopicsWithNull()
	{
		ArrayList<String> topics = new ArrayList<String>();

		topics.add("Computer Science");
		topics.add("Machine Learning");
		topics.add("blank");
		topics.add("Java");
		topics.add("Java");
		topics.add("blank");
		topics.add("Java");
		topics.add("blank");
		topics.add("Mobile Development");
		topics.add("Java");
		topics.add(null);
		topics.add(null);
		topics.add(null);
		topics.add(null);
		topics.add("Computer Science");
		topics.add("Java");
		topics.add("Machine Learning");
		topics.add(null);

		return topics;
	}

	private int badRemovalDemo(ArrayList<String> source, String textToRemove)
	{
		int removedCount = 0;

		for (int index = 0; index < source.size(); index++)
		{
			if (source.get(index).equals(textToRemove))
			{
				source.remove(index);
				removedCount++;
			}
		}

		return removedCount;
	}

	private int okayRemovalDemo(ArrayList<String> source, String textToRemove)
	{
		int removedCount = 0;

		for (int index = 0; index < source.size(); index++)
		{
			if (source.get(index).equals(textToRemove))
			{
				source.remove(index);
				index--;
				removedCount++;
			}
		}

		return removedCount;
	}

	private int betterRemovalDemo(ArrayList<String> source, String textToRemove)
	{
		int removedCount = 0;

		for (int index = source.size() - 1; index >= 0; index--)
		{
			if (source.get(index).equals(textToRemove))
			{
				source.remove(index);
				removedCount++;
			}
		}

		return removedCount;
	}

	private int bestRemovalDemo(ArrayList<String> source, String textToRemove)
	{
		int removedCount = 0;

		for (int index = source.size() - 1; index >= 0; index--)
		{
			if (textToRemove == null || source.get(index) == null)
			{
				if (textToRemove == source.get(index))
				{
					source.remove(index);
					removedCount++;
				}
			}
			else if (source.get(index).equals(textToRemove))
			{
				source.remove(index);
				removedCount++;
			}
		}

		return removedCount;
	}


}
