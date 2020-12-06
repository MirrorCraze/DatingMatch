package mainPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputRead {
	public static void readFile(String filename) throws FileNotFoundException {

		String name = "";
		double latCoor = 0;
		double longCoor = 0;
		char gender = 'f';
		int year = 0, maxAge = 0, minAge = 0, age = 0, amountOfPeople = 0;
		Scanner in = new Scanner(new File(filename + ".txt"));
		String inputAll;
		amountOfPeople = Integer.parseInt(in.nextLine());
		String[] inputDiv;
		// sc.nextLine(); //get \n
		for (int i = 0; i < amountOfPeople; i++) {

			inputAll = in.nextLine();
			inputDiv = inputAll.split(",");
			name = inputDiv[0];
			gender = inputDiv[1].charAt(0);
			age = Integer.parseInt(inputDiv[2]);
			maxAge = Integer.parseInt(inputDiv[3]);
			minAge = Integer.parseInt(inputDiv[4]);
			year = Integer.parseInt(inputDiv[5]);
			latCoor = Double.parseDouble(inputDiv[6]);
			longCoor = Double.parseDouble(inputDiv[7]);

			FloydWarshall.addPerson(name, gender, age, maxAge, minAge, year, latCoor, longCoor);
			/*
			 * User u; if(gender=='f'||gender=='F') u=new
			 * Female(name,gender,age,maxAge,minAge,year,latCoor,longCoor); else u=new
			 * Male(name,gender,age,maxAge,minAge,year,latCoor,longCoor);
			 */
		}
		return;
	}
}
