import java.util.*;

public class kpessekou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Sc = new Scanner(System.in);
		System.out.print("enter the game type :");
		String gameType = Sc.nextLine();
		
		// creating a list of cities
		
		List<String> allCities = Arrays.asList(
				"Kara", "Vogan");
		// shuffle the list to get a random order 
		Collections.shuffle(allCities);
		//initializing a table to track which cities were used for matches 
		boolean[] usedCities = new boolean[allCities.size()];
		// loop to generate matches 
		for (int i = 0 ; i < allCities.size() /2 ; i++) {
			//search for the next city available for the match
			String city1 = getNextAvailableCity(usedCities, allCities);
			String city2 = getNextAvailableCity(usedCities, allCities);
			
			// display of the cities chosen for the match 
			
			System.out.printf("Generating playoff city  %d :%s\n", i + 1, city1);
			System.out.printf("Generating playoff city  %d :%s\n", i + 2 , city2);
			
			
		}
		
	}
	// function to find the next available city for a match
	private static String getNextAvailableCity(boolean[] usedCities, 
		List<String> allCities	) {
		// as long as there are cities avaible 
		while (true ) {
			//generation of a random index in the list of cities 
			int index = new Random().nextInt(allCities.size());
			//check if the city has not already been used
			if (!usedCities[index]) {
				//marking the city as used and returning its name
				usedCities[index]= true;
				return allCities.get(index);
			}
		}
	}

}