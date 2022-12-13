package list.model;

import java.util.ArrayList;

public class DebugDuck
{

	private String duckName;
	private String humanName;
	private ArrayList<String> questions;
	
	public DebugDuck()
	{
		this.duckName = "Mx. Quaxxers";
		this.humanName = "Mammal";
		this.questions = new ArrayList<String>();
	}
	
	public DebugDuck(String duckName, String humanName)
	{
		this.duckName = duckName;
		this.humanName = humanName;
		this.questions = new ArrayList<String>();
	}

	public String getDuckName()
	{
		return duckName;
	}
	
	public String getHumanName()
	{
		return humanName;
	}

	public int getAnsweredQuestions()
	{
		return questions.size();
	}

	public void resetQuestions()
	{
		this.questions = new ArrayList<String>();
	}

	public void askQuestion(String question)
	{
		questions.add(question);
	}
	
	@Override
	public String toString()
	{
		String description = "\n" + "Duck: " + duckName +" human: " + humanName + ", questions: " + getAnsweredQuestions() + "\n";
		
		return description;
	}
}
