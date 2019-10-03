import java.util.ArrayList;

public class Legion
{
	private ArrayList<Archangel> archangelArray;

	//Constructor
	public Legion ()
	{		
		archangelArray= new ArrayList<Archangel>();
	}

	//Set methods
	public void setArchangelArray (ArrayList<Archangel> archangelArray)
	{
		this.archangelArray = archangelArray;
	}

	//Get methods 
	public ArrayList<Archangel> getArchangelArray ()
	{
		return this.archangelArray;
	}

	//FR
	public void addArchangel(String name, String photo, String prayer, String power, int month, int day, String color, int size, String essence, double illuminanceDegree)
	{
		Candle candle = null;
		Archangel archangel = new Archangel	(name, photo, prayer, power, month, day, candle);
		candle = archangel.createCandle (color, size, essence, illuminanceDegree);
		archangel.setCandle(candle);
		archangelArray.add(archangel);
	}

	public boolean nameValidator(String name)
	{
		if (name.length() != 1)
		{
			if ((name.charAt(name.length() - 2) == 'e' || name.charAt(name.length() - 2) == 'E') && (name.charAt(name.length() - 1) == 'l' || name.charAt(name.length() - 1) == 'L'))
			{
				boolean error = false;

				for (int c = 0; c < archangelArray.size() && archangelArray.get(c) != null && error == false; c++)
				{
					if (name.equalsIgnoreCase(archangelArray.get(c).getName()) )
					{
						error = true;
					}
				}
				
				if (error == true)
				{
					System.out.println("\n!!!!| Error: name's already in use. |!!!!");
					return false;
				}

				else 
				{
					return true; 
				}
			}

			else
			{
				System.out.println("\n!!!!| Error: Invalid name for an archangel, must end with 'el'. |!!!!");
				return false;
			}
		}

		else
		{
			System.out.println("\n!!!!| Error: Invalid name for an archangel, must end with 'el'. |!!!!");
			return false;
		}
	}

	public boolean powerValidator (String power)
	{
		boolean error = false;

		for (int c = 0; c < archangelArray.size() && archangelArray.get(c) != null && error == false; c++)
		{
			if (power.equalsIgnoreCase(archangelArray.get(c).getPower()) )
			{
				error = true;
			}
		}
			
		if (error == true)
		{
			System.out.println("\n!!!!| Error: power already assigned to an archangel. |!!!!");
			return false;
		}
		
		else
		{
			return true;
		}
	}

	public boolean monthValidator (int month)
	{
		if (month > 12 || month < 1)
		{
			System.out.println("\n!!!!| Error: Not a valid month. Must be between 1 and 12. |!!!!");
			return false; 
		}

		else
		{
			return true;
		}
	}

	public boolean dayValidator (int day)
	{
		if (day > 31 || day < 1)
		{
			System.out.println("\n!!!!| Error: Not a valid day. Must be between 1 and 31. |!!!!");
			return false; 
		}

		else
		{
			return true;
		}
	}

	public boolean sizeValidator (int size)
	{
		if (size < 1 || size > 3)
		{
			System.out.println("!!!!| Error: Not a valid size. Must be between 1 and 3. |!!!!");
			return false;
		}

		else
		{
			return true;
		}
	}
}