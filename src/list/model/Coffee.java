package list.model;

public class Coffee
{
	private int caffeineAmount;
	private int cupSize;
	private String name;
	private boolean isCaffeinated;
	
	public Coffee()
	{
		this.caffeineAmount = 0;
		this.cupSize = 0;
		this.name = "default coffee";
		this.isCaffeinated = true;
	}
	
	public Coffee(int cupSize, String name, boolean isCaffeinated)
	{
		this.cupSize = cupSize;
		this.name = name;
		this.isCaffeinated = isCaffeinated;
	}
	
	public void sip()
	{
		this.cupSize -= 2;
	}
	
	public void gulp()
	{
		this.cupSize -= 4;
	}
	
	public int getCaffeineAmount()
	{
		return caffeineAmount;
	}

	public int getCupSize()
	{
		return cupSize;
	}

	public String getName()
	{
		return name;
	}

	public boolean isCaffeinated()
	{
		return isCaffeinated;
	}

	public void setCupSize(int cupSize)
	{
		this.cupSize = cupSize;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	@Override
	public String toString()
	{		
		String description = "\n"+ "Coffee: " + name + " , size: " + cupSize ;
		return description;
	}
}
