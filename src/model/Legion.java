package model;

import java.util.ArrayList;

public class Legion
{
	private ArrayList<Archangel> archangelArray;

	//Constructor
	public Legion ()
	{		
		archangelArray= new ArrayList<Archangel>();
	}

	//FR

	/**This method creates and adds an archangel. It also receives and sends the information for the creation of a candle.<br>
	*<b>post:</b>An archangel is created and added to Legion's arrayList.
	*@param name. A String containing the name of the archangel. Must end with "el".
	*@param photo. A String containing the url of the archangel's photo. 
	*@param prayer. A String containing the prayer of the archangel.
	*@param power. A String containing the power of the archangel.
	*@param month. An integer representing the month of the celebration date. Must be between 1 and 12.
	*@param day. An integer representing the day of the celebration date. Must be between 1 and 31.
	*@param color. A String containing the color of the candle.
	*@param size. An integer representing the size of the candle.
	*@param essence. A String containing the aroma of the candle.
	*@param illuminanceDegree. A double representing the illuminance degree of the candle. Cannot be 0. Cannot be negative.
	*/
	public void addArchangel(String name, String photo, String prayer, String power, int month, int day, String color, int size, String essence, double illuminanceDegree)
	{
		Candle candle = null;
		Archangel archangel = new Archangel	(name, photo, prayer, power, month, day, candle);
		candle = archangel.createCandle (color, size, essence, illuminanceDegree);
		archangel.setCandle(candle);
		archangelArray.add(archangel);
	}
	/**This method checks if the name is valid for an archangel.<br>
	*<b>Pre:</b> name is a String.
	*<b>Post:</b> The name is valid, boolean is true.
	*The name is already taken, boolean is false.
	*The name doesn't end with "el", furthermore is invalid. boolean is false.
	*@param name. The name of the archangel that'll be checked.
	*@return True if name's valid.
	*False if name's invalid or already exists.
	*/
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
	
	/**This method checks if the power already exists.<br>
	*<b>Pre:</b> power is a String.
	*<b>Post:</b> The power is not being used, boolean is true.
	*The power is already taken, boolean is false.
	*@param power. The power of the archangel that'll be checked.
	*@return True if power's available.
	*False if power's unavailable.
	*/
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

	/**This method checks if the month is between 1 and 12.<br>
	*<b>Pre:</b> month is a natural integer.
	*<b>Post:</b> The month's correct, boolean is true.
	*The month's incorrect, boolean is false.
	*@param month. The month number that'll be checked.
	*@return True if month's correct.
	*False if month's incorrect.
	*/
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

	/**This method checks if the day is between 1 and 31.<br>
	*<b>Pre:</b> day is a natural integer.
	*<b>Post:</b> The day's correct, boolean is true.
	*The day's incorrect, boolean is false.
	*@param day. The day number that'll be checked.
	*@return True if day's correct.
	*False if day's incorrect.
	*/
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

	/**This method checks if the size is between 1 and 3.<br>
	*<b>Pre:</b> size is a natural integer.
	*<b>Post:</b> The size's correct, boolean is true.
	*The size's incorrect, boolean is false.
	*@param size. The size number that'll be checked.
	*@return True if size's correct.
	*False if size's incorrect.
	*/
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

	/**This method checks if the illuminance degree is bigger than zero.<br>
	*<b>Pre:</b> illuminance  degree is a rational integer.
	*<b>Post:</b> The illuminance degree's correct, boolean is true.
	*The illuminance degree's incorrect, boolean is false.
	*@param illuminanceDegree. The illuminance degree that'll be checked.
	*@return True if illuminance degree's correct.
	*False if illuminance degree's incorrect.
	*/
	public boolean illuminanceValidator (double illuminanceDegree)
	{
		if (illuminanceDegree <= 0)
		{
			System.out.println("!!!!| Error: Invalid illuminance degree. |!!!!");
			return false;
		}

		else 
		{
			return true;
		}
	}

	/**This method translates the size's number into String and prints the details of the archangel's related to the keyword.<br>
	*<b>Post:</b> The archangel's details were printed.
	*An error is printed.
	*@param key. A String containing either the name or the power of the archangel. 
	*/
	public void displayArchangelInfo(String key)
	{
		boolean done = false;
		String size = "";


		for (int c = 0; c < archangelArray.size() && done == false; c++)
		{
			if (key.equalsIgnoreCase(archangelArray.get(c).getName())  || (key.equalsIgnoreCase(archangelArray.get(c).getPower()) ))
			{
				if (archangelArray.get(c).getCandle().getSize() == 1)
				{
					size = "Small";		
				}

				else if (archangelArray.get(c).getCandle().getSize() == 2)
				{
					size = "Medium";
				}

				else if (archangelArray.get(c).getCandle().getSize() == 3)
				{
					size = "Large";
				}
				
				String monthString =  convertMonth(archangelArray.get(c).getMonth());

				System.out.println("\n~~~Archangel " + archangelArray.get(c).getName() + "~~~");
				System.out.println("\n~Photo url: " + archangelArray.get(c).getPhoto());
				System.out.println("\n~Prayer: " +  archangelArray.get(c).getPrayer());
				System.out.println("\n~Month: " + monthString + ".");
				System.out.println("\n~Day: " + archangelArray.get(c).getDay());
				System.out.println("\n~Power: " + archangelArray.get(c).getPower() + ".");
				System.out.println("\n~~~Candle~~~");
				System.out.println("\n~Color: " + archangelArray.get(c).getCandle().getColor() + ".");
				System.out.println("\n~Size: " + size + ".");
				System.out.println("\n~Essence: " + archangelArray.get(c).getCandle().getEssence() + ".");
				System.out.println("\n~Illuminance degree: " + archangelArray.get(c).getCandle().getIlluminanceDegree());
				
				done = true;
			} 
		}

		if (done == false)
		{
			System.out.println("\n!!!!| Error: Archangel name or power doesn't exist. |!!!!");
		}
	}
	/**This method converts a month from number to text.<br>
	*<b>Pre:</b>Month has to be a natural integer.
	*<b>Post:</b>Month number is converted to its equivalent in text.
	*@param month. Month number that'll be converted.
	*@return The month in letters.
	*/
	public String convertMonth (int month)
	{
		String monthString;

		switch (month)
		{
			case 1:
			{
				monthString = "January";
				break;
			}

			case 2:
			{
				monthString = "February";
				break;
			}

			case 3:
			{
				monthString = "March";
				break;
			}

			case 4: 
			{
				monthString = "April";
			}

			case 5: 
			{
				monthString = "May";
				break;
			}

			case 6:
			{
				monthString = "June";
				break;
			}

			case 7:
			{
				monthString = "July";
				break;
			}

			case 8:
			{
				monthString = "August";
				break;
			}

			case 9:
			{
				monthString = "September";
				break;
			}

			case 10:
			{
				monthString = "October";
				break;
			}

			case 11:
			{
				monthString = "November";
				break;
			}

			case 12:
			{
				monthString = "December";
				break;
			}

			default:
			{
				monthString = "!!!!| Error: Cannot convert. |!!!!";
			}
		}

		return monthString;
	}
/**This method concatenates the celebration dates based on the decision of the user.<br>
*<b>Post:</b> The dates were concatenated in a String.
*No celebration dates were found between the month.
*@param decision. A number that decides which process is followed.
*@param month. The month in number.
*@return The celebration dates in a String.
*An message notifying that no celebration were found within the month.
*/
	public String printDates (int decision, int month)
	{
		String msg = "";
		String monthString = "";

		if (decision == 1)
		{
			boolean nothing = true;
			
			monthString = convertMonth(month);

			msg += "\n~~~| " + monthString + " |~~~\n";

			for (int i = 0; i < archangelArray.size(); i++)
			{
				if (archangelArray.get(i).getMonth() == month)
				{
					msg += "\narchangel: " + archangelArray.get(i).getName() + ".\nDay: " + archangelArray.get(i).getDay() + "\nCandle color: " + archangelArray.get(i).getCandle().getColor() + ".\nCandle essence: " + archangelArray.get(i).getCandle().getEssence() + ".\n";
					nothing = false;
				}
			}

			if (nothing == true)
			{
				msg = "\nxxxx| No celebration dates were found in this month. |xxxx";
			}
		}

		else 
		{
			msg += "\n";
			for (int i = 0; i < archangelArray.size(); i++)
			{
				monthString = convertMonth(archangelArray.get(i).getMonth());

				msg += archangelArray.get(i).getName() + ": " + monthString + " " + archangelArray.get(i).getDay() + ", ";
			}
			msg = msg.substring(0,msg.length() - 2);
			msg += ".";
		}
	
		return msg;
	}
}