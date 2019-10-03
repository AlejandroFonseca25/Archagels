package model;

public class Candle
{
	private String color; 
	private int size;
	private String essence;
	private double illuminanceDegree;	
	
	//Constructor
	public Candle (String color, int size, String essence, double illuminanceDegree)
	{
		this.color = color;
		this.size = size;
		this.essence = essence;
		this.illuminanceDegree = illuminanceDegree;
	}
	
	//Set methods
	public void setColor (String color)
	{
		this.color = color;
	}
	
	public void setSize (int size)
	{
		this.size = size;
	}

	public void setEssence (String essence)
	{
		this.essence = essence;
	}

	public void setIlluminanceDegree (double illuminanceDegree)
	{
		this.illuminanceDegree = illuminanceDegree;
	}

	//Get methods
	public String getColor ()
	{
		return this.color;
	}

	public int getSize ()
	{
		return this.size;
	}

	public String getEssence ()
	{
		return this.essence;
	}

	public double getIlluminanceDegree ()
	{
		return this.illuminanceDegree;
	}

}