package mainPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		FloydWarshall.mapInitialize();
		String filename;
		Scanner sc = new Scanner(System.in);
		int command;
		boolean done=false;
		System.out.println("Please input the data file name:");
		filename = sc.next();
		FloydWarshall.readFile(filename);
		System.out.println("Data collected, thank you, dear!\n");
		double[][] distance = FloydWarshall.calShortestDist();
		while(!done)
		{
			System.out.println("Hello again dear love bird! Please select a service from the following list:");
			System.out.println("1 Input another data file name");
			System.out.println("2 Display shortest distances");
			System.out.println("3 Display scores");
			System.out.println("4 Display matches");
			System.out.println("0 Exit");
			command=sc.nextInt();
			switch (command) {
			case 1:
			System.out.println("Please input the data file name:");
			filename = sc.next();
			FloydWarshall.readFile(filename);
			System.out.println("Data collected, thank you dear");
			break;
			case 2: 
			FloydWarshall.printDist(distance);
			System.out.println();
			break;
			case 3:
			Stable_Matching.setScore();
			System.out.println();
			break;
			case 4:
			Stable_Matching.stable_match();
			System.out.println();
			break;
			case 0:
			done=true;
			break;
			}
		}
		
		sc.close();
		
	}
}