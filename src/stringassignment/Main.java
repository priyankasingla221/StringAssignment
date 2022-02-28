package stringassignment;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		City city = new City();

		System.out.println("Welcome to Ontario!");
		
		
		System.out.println("Please Enter City name: ");
		String findcityname = sc.next();
		city.findCityName(findcityname);
		
		System.out.println("Please enter city name you want to Replace which should start with T: ");
		String replacecity = sc.next();
		city.replacecityName(replacecity);
		
		
		city.address();
		

	}

}
