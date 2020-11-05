package mainPackage;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		FloydWarshall.mapInitialize();
		int amountOfPeople;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many contestants?");
		amountOfPeople = sc.nextInt();
		String name;
		double latCoor;
		double longCoor;
		char sex;
		String inputAll;
		String[] inputDiv;
		sc.nextLine(); //get \n
		for(int i=0;i<amountOfPeople;i++)
		{
			System.out.print("Please input name, decimal coordinate (latitude,longtitude) and gender (M,F).\n");
			System.out.print("The format will be name,lat,long,gender : ");
			
			inputAll = sc.nextLine();
			inputDiv = inputAll.split(",");
			name = inputDiv[0];
			latCoor = Double.parseDouble(inputDiv[1]);
			longCoor = Double.parseDouble(inputDiv[2]);
			sex = inputDiv[3].charAt(0);
			FloydWarshall.addPerson(name,latCoor,longCoor,sex);
		}
		double[][] dist = FloydWarshall.calShortestDist();
		FloydWarshall.printDist(dist);
		sc.close();
	}

}
