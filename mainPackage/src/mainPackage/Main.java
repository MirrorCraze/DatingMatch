package mainPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		FloydWarshall.mapInitialize();
		String filename;
		Scanner sc = new Scanner(System.in);
		System.out.println("File Name?");
		filename = sc.next();
		FloydWarshall.readFile(filename);
		/*
		 * String name=""; double latCoor=0; double longCoor=0; char gender='f'; int
		 * year=0,maxAge=0,minAge=0,age = 0, amountOfPeople=0; Scanner in=new
		 * Scanner(new File(filename+".txt")); String inputAll;
		 * amountOfPeople=Integer.parseInt(in.nextLine()); String[] inputDiv;
		 * sc.nextLine(); //get \n for(int i=0;i<amountOfPeople;i++) {
		 * 
		 * inputAll = in.nextLine(); inputDiv = inputAll.split(","); name = inputDiv[0];
		 * gender=inputDiv[1].charAt(0); age=Integer.parseInt(inputDiv[2]);
		 * maxAge=Integer.parseInt(inputDiv[3]); minAge=Integer.parseInt(inputDiv[4]);
		 * year=Integer.parseInt(inputDiv[5]); latCoor =
		 * Double.parseDouble(inputDiv[6]); longCoor = Double.parseDouble(inputDiv[7]);
		 * 
		 * FloydWarshall.addPerson(name,gender,age,maxAge,minAge,year,latCoor,longCoor);
		 * User u; if(gender=='f'||gender=='F') u=new
		 * Female(name,gender,age,maxAge,minAge,year,latCoor,longCoor); else u=new
		 * Male(name,gender,age,maxAge,minAge,year,latCoor,longCoor); }
		 */
		sc.close();
		// System.out.println(name+" "+gender+" "+age+" "+minAge+" "+maxAge+" "+year+"
		// "+latCoor+" "+longCoor);
		double[][] distance = FloydWarshall.calShortestDist();
		FloydWarshall.calShortestDist();
		FloydWarshall.printDist(distance);
		Stable_Matching.setScore();
		Stable_Matching.stable_match();
		Stable_Matching.printCouples();

	}
}
