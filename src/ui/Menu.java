package ui;

import package.model.*;
import java.util.Scanner;

public class Menu
{	
	//Atributes 
	private Legion maximumSuperior;
	private Scanner reader;

	//Main method
	public static void main (String[] args)
	{	
		Menu menu = new Menu ();
		menu.mainMenu();
	}

	//Constructor
	public Menu ()
	{
		reader = new Scanner(System.in); 
		maximumSuperior = new Legion();
	}


	//Menus
	public void mainMenu  ()
	{
		boolean on = true; 
		int angelNumber = 3;
		
		init();

		while (on == true)
		{
			System.out.println("\n+-------------------------------------------------------------------------------------------+");
			System.out.println("                       ~*| Welcome to Heaven's Door: Archangel edition |*~\n                     ");
			System.out.println("Enter the number of the function you want to do.");
			System.out.println("There are currently " + angelNumber + " archangels created.");
			System.out.println("\n1 = Create a new archangel.\n2 = Search an archangel.\n3 = Display celebration dates.\n4 = Exit.");
			System.out.println("+-------------------------------------------------------------------------------------------+");

			int decision = reader.nextInt();

			switch (decision)
			{
				case 1:
				angelNumber = creationMenu(angelNumber);
				break;
				
				case 2:
				searchMenu();
				break;
				
				case 3:
				datesMenu();
				break;
				
				case 4:
				on = false;
				break;

				default:
				System.out.println("\nxxxx| Invalid option, try again. |xxxx");
			}
		}
	}

	public int creationMenu (int angelNumber)
	{
		boolean good; 

		System.out.println("                                <<<Archangel creation menu>>>                                ");
		System.out.println("\nEnter the name of the archangel (No point at the end).");
		String name = reader.next();
		
		good = maximumSuperior.nameValidator(name);

		if (good == true)
		{
			
			System.out.println("\nEnter the photo's url of the archangel.");
			String photo = reader.next();
			
			System.out.println("\nEnter the prayer of the archangel.");
			String prayer = reader.next();
			
			System.out.println("\nEnter the power of the archangel (Only one, no point at the end. ex: Healing).");
			String power = reader.next();
			
			good = maximumSuperior.powerValidator(power);

			if (good == true)
			{
				System.out.println("\nEnter the celebration's month (1-12).");
				int month = reader.nextInt();

				good = maximumSuperior.monthValidator(month);

				if (good == true)
				{
					
					System.out.println("\nEnter the celebration's day (1-31).");
					int day = reader.nextInt();
					
					good = maximumSuperior.dayValidator(day);

					if (good == true)
					{
						System.out.println("\nEnter the color of the candle.");
						String color = reader.next();
						
						System.out.println("\nEnter the size of the candle. (1=small, 2=medium, 3=large).");
						int size = reader.nextInt();

						good = maximumSuperior.sizeValidator(size);

						if (good == true)
						{
							System.out.println("\nEnter the essence of the candle.");
							String essence = reader.next();

							System.out.println("\nEnter the illuminance degree of the candle.");
							double illuminanceDegree = reader.nextDouble();

							maximumSuperior.addArchangel(name, photo, prayer, power, month, day, color, size, essence, illuminanceDegree);

							System.out.println("\n~~~| The archangel was successfully created. |~~~");
							angelNumber += 1;
							return angelNumber;
						}
					}
				}
			}
		}

		return angelNumber;
	}

	public void searchMenu ()
	{

	}

	public void datesMenu ()
	{

	}

	public void init ()
	{
		maximumSuperior.addArchangel ("Gabriel", "https://www.archangels.com/photos/gabriel.jpeg", "Glorioso Arcangel Gabriel, fortaleza de Dios, principe entre los espiritus angelicos, representante del Altisimo, que fuiste escogido para anunciar a la Santisima Virgen la Encarnacion: yo te suplico que ruegues a Dios por mi, para logre gozar el fruto de la redencion divina en la gloria del Cielo. Amen.", "Comunication", 3, 18, "Yellow", 2, "Vanilla", 10.5);
		maximumSuperior.addArchangel ("Miguel", "https://www.archangels.com/photos/miguel.jpeg", "San Miguel Arcangel, defiendenos en la lucha. Sé nuestro amparo contra la perversidad y acechanzas del demonio. Que Dios manifieste sobre el su poder, es nuestra humilde suplica. Y tu, oh Principe de la Milicia Celestial, con el poder que Dios te ha conferido, arroja al infierno a Satanas, y a los demas espiritus malignos que vagan por el mundo para la perdición de las almas. Amen.", "Courage", 9, 29, "Red", 3, "Cinnamon", 12);
		maximumSuperior.addArchangel ("Rafael", "https://www.archangels.com/photos/rafel.jpeg", "Oh poderoso Principe de la gloria San Rafael, llamado medicina de Dios, salud de los enfermos, luz de los ciegos, guia de caminantes, protector de la limosna, del ayuno y de la oracion: por aquella caridad con que acompaniaste al joven Tobias, te pido, oh glorioso protector mio, me libres de todos los males y peligros, y me acompanies en la peregrinacion de esta vida mortal, para llegar felizmente a puerto de salvacion en la eterna. Amen.", "Protection", 10, 24, "White", 1, "Mint", 7.75);
	}
}
