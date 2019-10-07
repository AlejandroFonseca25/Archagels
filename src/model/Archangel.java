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

	//Set method
	public void setCandle(Candle candle)
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
		return this.photo;
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

	/**This method creates and then returns a candle.<br>
	*<b>Post:</b>A candle is created.
	*@param color. String with the color of the candle. 
	*@param size. A number representing the size of the candle. Must be between 1 and 3.
	*@param essence. A String with the essence of the candle.
	*@param illuminanceDegree. A Rational number representing the illuminance degree of the candle. In lux.
	*@return A candle object. 
	*/
	public Candle createCandle (String color, int size, String essence, double illuminanceDegree)
	{
		Candle candle = new Candle (color, size, essence, illuminanceDegree);
		return candle; 
	}
}