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
		double[][] distance = InputRead.readFile(filename);
		System.out.println("Data collected, thank you, dear!\n");
		Stable_Matching.setScore();
		while(!done)
		{
			System.out.println("Hello again dear love bird! Please select a service from the following list:");
			System.out.println("1 Display shortest distances");
			System.out.println("2 Display scores");
			System.out.println("3 Display matches");
			System.out.println("0 Exit");
			command=sc.nextInt();
			switch (command) {
			case 1: 
				FloydWarshall.printDist(distance);
				System.out.println();
			break;
			case 2:
				Stable_Matching.printScore();
				System.out.println();
			break;
			case 3:
				Stable_Matching.stable_match();
				System.out.println();
			break;
			case 0:
				done=true;
				System.out.println("Bye Bye!");
				System.out.println("-------END OF PROGRAM-------");
			break;
			}
		}
		
		sc.close();
		
	}
}