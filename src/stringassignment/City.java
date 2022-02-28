package stringassignment;

public class City {
	
	//Part 1: a String array which stores names of cities 
	String[] cities = { "Toronto", "Scarborough", "Hamilton", "Malton" };


	
	
	//Part 2: checking array city is found or not.
	String findCityName(String findCityName) {

		for (int i = 0; i < cities.length; i++) {
			if (cities[i].equalsIgnoreCase(findCityName)) {
				System.out.println("City Name Found!");
				break;
			}
		}
		
		return "****City Name not Found!*****";
		

	}

	// Part 2: Checking with entered city starts with T and is in Array can be replaced or
	// not.
	public void replacecityName(String replacecity) {
		System.out.println("City name Entered: " + replacecity);

		for (int i = 0; i < cities.length; i++) {
			if (cities[i].startsWith("T") && replacecity.startsWith("T")) {
				System.out.println("New City Name: " + cities[i].replace(replacecity, "Missisauga"));
				break;
			} else {
				System.out.println("******Entered City Name Cannot replaced!******");
				break;
			}
		}
		
	}
	
	//Part 3: Spliting address in three different forms of string and advance concepts.
	
	public void address() {
		
	
	String str = "100 queen street,Toronto,M5V 3E3";
	
	//appending 99 value using string
	int addresscode = 8195076;
	String str1 = String.valueOf(addresscode);
	System.out.println("***Address Code using Concatenation: " +str1+99+ "***");
	
	//Appending double value to get output from string. 
	double landline = 4366359.00;
	String str2 = String.valueOf(landline);
	System.out.println("**Landline: " +str2);
	
	
	System.out.println("~~~~~Full Address is : "+str+"~~~~~~");
	String streetadr = str.substring( 0,str.indexOf(","));
	System.out.println("Street Address: "+streetadr);
	
	String city = str.substring(str.indexOf("Toronto"),str.lastIndexOf(","));
	System.out.println("City Address: "+city);
	
	String zipCode = str.substring(str.indexOf("M5V 3E3"));
	System.out.println("Zip Code: "+zipCode);
	
	
	}

}
