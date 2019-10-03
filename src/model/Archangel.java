package model;

public class Archangel
{
	private String name; 
	private String photo;
	private String prayer;
	private int month;
	private int day;
	private String power;
	private Candle candle;

	public Archangel (String name, String photo, String prayer, String power, int month, int day, Candle candle)
	{
		this.name = name;
		this.photo = photo;
		this.prayer = prayer;
		this.power = power;
		this.month  = month;
		this.day = day;
		this.candle = candle;
	}

	//Set methods
	public void setName (String name)
	{
		this.name = name;
	}

	public void setPhoto (String photo)
	{
		this.photo = photo;
	}

	public void setPrayer (String prayer)
	{
		this.prayer = prayer;
	}

	public void setPower (String power)
	{
		this.power = power; 
	}

	public void setMonth (int month)
	{
		this.month = month;
	}

	public void setDay (int day)
	{
		this.day = day;
	}

	public void setCandle (Candle candle)
	{
		this.candle = candle;
	}

	//Get methods
	public String getName ()
	{
		return this.name;
	}

	public String getPhoto ()
	{
		return this.name;
	}

	public String getPrayer ()
	{
		return this.prayer;
	}

	public String getPower ()
	{
		return this.power;
	}

	public int getMonth ()
	{
		return this.month;
	}

	public int getDay ()
	{
		return this.day;
	}


	public Candle getCandle ()
	{
		return this.candle; 
	}

	//FR
	public Candle createCandle (String color, int size, String essence, double illuminanceDegree)
	{
		Candle candle = new Candle (color, size, essence, illuminanceDegree);
		return candle; 
	}
}